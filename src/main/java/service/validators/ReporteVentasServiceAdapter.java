package service.validators;

import domain.ReporteVentas;
import domain.Venta;
import service.inputports.ReporteVentasServiceInterface;
import service.outputports.ReporteVentasRepositoryPort;
import service.outputports.VentaRepositoryPort;

public class ReporteVentasServiceAdapter implements ReporteVentasServiceInterface {

    private final ReporteVentasRepositoryPort reporteVentasRepositoryPort;
    private final VentaRepositoryPort ventaRepositoryPort;

    public ReporteVentasServiceAdapter(ReporteVentasRepositoryPort reporteVentasRepositoryPort, VentaRepositoryPort ventaRepositoryPort) {
        this.reporteVentasRepositoryPort = reporteVentasRepositoryPort;
        this.ventaRepositoryPort = ventaRepositoryPort;
    }

    @Override
    public ReporteVentas generarReporte(String fecha) {
        double totalVentas = 0;
        int cantidadVentas = 0;
        Venta ultimaVenta = null;

        // Suma las ventas de la fecha indicada
        for (Venta venta : ventaRepositoryPort.selectAll()) {
            if (venta.getFecha().equals(fecha)) {
                totalVentas = totalVentas + venta.getTotal();
                cantidadVentas++;
                ultimaVenta = venta;
            }
        }

        ReporteVentas reporte = new ReporteVentas(fecha, totalVentas, cantidadVentas, ultimaVenta);
        return reporteVentasRepositoryPort.save(reporte);
    }
}
