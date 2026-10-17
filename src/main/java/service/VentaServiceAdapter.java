package service;

import domain.Pedido;
import domain.Tienda;
import domain.Venta;
import service.inputports.VentaServiceInterface;
import service.outputports.PedidoRepositoryPort;
import service.outputports.TiendaRepositoryPort;
import service.outputports.VentaRepositoryPort;

import java.util.List;

public class VentaServiceAdapter implements VentaServiceInterface {

    private final VentaRepositoryPort ventaRepositoryPort;
    private final PedidoRepositoryPort pedidoRepositoryPort;
    private final TiendaRepositoryPort tiendaRepositoryPort;

    public VentaServiceAdapter(VentaRepositoryPort ventaRepositoryPort, PedidoRepositoryPort pedidoRepositoryPort, TiendaRepositoryPort tiendaRepositoryPort) {
        this.ventaRepositoryPort = ventaRepositoryPort;
        this.pedidoRepositoryPort = pedidoRepositoryPort;
        this.tiendaRepositoryPort = tiendaRepositoryPort;
    }

    @Override
    public Venta createVenta(Integer idVenta, String fecha, String estado, int idPedido, int idTienda) {
        Pedido pedido = pedidoRepositoryPort.selectById(idPedido);
        Tienda tienda = tiendaRepositoryPort.selectById(idTienda);
        if (pedido == null || tienda == null) {
            return null;
        }
        // El total de la venta es el total del pedido
        Venta venta = new Venta(idVenta, fecha, pedido.getTotal(), estado, pedido, tienda);
        return ventaRepositoryPort.save(venta);
    }

    @Override
    public List<Venta> selectAllVentas() {
        return ventaRepositoryPort.selectAll();
    }

    @Override
    public Venta selectVentaById(int idVenta) {
        return ventaRepositoryPort.selectById(idVenta);
    }
}
