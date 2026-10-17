package domain;

public class ReporteVentas {

    private String fecha;
    private double totalVentas;
    private Integer cantidadVentas;
    private Venta venta;

    public ReporteVentas() {

    }

    public ReporteVentas(String fecha, double totalVentas, Integer cantidadVentas, Venta venta) {
        this.fecha = fecha;
        this.totalVentas = totalVentas;
        this.cantidadVentas = cantidadVentas;
        this.venta = venta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Integer getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(Integer cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void generarReporte(){

    }
}
