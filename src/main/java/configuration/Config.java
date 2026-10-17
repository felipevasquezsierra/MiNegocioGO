package configuration;

import repository.*;
import service.*;
import service.inputports.*;
import service.outputports.*;
import ui.CliUserInterface;
import view.*;

public class Config {

    public static CliUserInterface getCliUserInterface() {

        // Repositorios (se crea uno de cada uno y se comparte)
        ClienteRepositoryPort clienteRepositoryPort = new ClienteRepositoryAdapter();
        TiendaRepositoryPort tiendaRepositoryPort = new TiendaRepositoryAdapter();
        ProductoRepositoryPort productoRepositoryPort = new ProductoRepositoryAdapter();
        InventarioRepositoryPort inventarioRepositoryPort = new InventarioRepositoryAdapter();
        PedidoRepositoryPort pedidoRepositoryPort = new PedidoRepositoryAdapter();
        PagoRepositoryPort pagoRepositoryPort = new PagoRepositoryAdapter();
        VentaRepositoryPort ventaRepositoryPort = new VentaRepositoryAdapter();
        ReporteVentasRepositoryPort reporteVentasRepositoryPort = new ReporteVentasRepositoryAdapter();

        // Servicios (aquí se conectan las clases como en el UML)
        ClienteServiceInterface clienteService = new ClienteServiceAdapter(clienteRepositoryPort);
        TiendaServiceInterface tiendaService = new TiendaServiceAdapter(tiendaRepositoryPort);
        ProductoServiceInterface productoService = new ProductoServiceAdapter(productoRepositoryPort);
        InventarioServiceInterface inventarioService = new InventarioServiceAdapter(inventarioRepositoryPort, productoRepositoryPort);
        PedidoServiceInterface pedidoService = new PedidoServiceAdapter(pedidoRepositoryPort, clienteRepositoryPort, productoRepositoryPort);
        PagoServiceInterface pagoService = new PagoServiceAdapter(pagoRepositoryPort, pedidoRepositoryPort);
        VentaServiceInterface ventaService = new VentaServiceAdapter(ventaRepositoryPort, pedidoRepositoryPort, tiendaRepositoryPort);
        ReporteVentasServiceInterface reporteService = new ReporteVentasServiceAdapter(reporteVentasRepositoryPort, ventaRepositoryPort);

        // Views
        ClienteView clienteView = new ClienteView(clienteService);
        TiendaView tiendaView = new TiendaView(tiendaService);
        ProductoView productoView = new ProductoView(productoService);
        InventarioView inventarioView = new InventarioView(inventarioService);
        PedidoView pedidoView = new PedidoView(pedidoService);
        PagoView pagoView = new PagoView(pagoService);
        VentaView ventaView = new VentaView(ventaService);
        ReporteVentasView reporteVentasView = new ReporteVentasView(reporteService);

        return new CliUserInterface(clienteView, tiendaView, productoView, inventarioView,
                pedidoView, pagoView, ventaView, reporteVentasView);
    }
}
