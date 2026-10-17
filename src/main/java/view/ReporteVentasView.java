package view;

import domain.ReporteVentas;
import service.inputports.ReporteVentasServiceInterface;

public class ReporteVentasView {

    private final ReporteVentasServiceInterface reporteVentasServiceInterface;

    public ReporteVentasView(ReporteVentasServiceInterface reporteVentasServiceInterface) {
        this.reporteVentasServiceInterface = reporteVentasServiceInterface;
    }

    public void generarReporte() {
        String fecha = DataTypeValidator.validateString("Ingrese la fecha del reporte (AAAA-MM-DD)");
        ReporteVentas reporte = reporteVentasServiceInterface.generarReporte(fecha);

        System.out.println("Reporte del " + reporte.getFecha());
        System.out.println("Cantidad de ventas: " + reporte.getCantidadVentas());
        System.out.println("Total vendido: $" + reporte.getTotalVentas());
    }
}
