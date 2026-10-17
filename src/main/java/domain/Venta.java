package domain;

public class Venta {

    private Integer idVenta;
    private String fecha;
    private double total;
    private String estado;
    private Pedido pedido;
    private Tienda tienda;

    public Venta(){

    }

    public Venta(Integer idVenta, String fecha, double total, String estado, Pedido pedido, Tienda tienda) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.pedido = pedido;
        this.tienda = tienda;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public void create(){

    }

    public void selectAll(){

    }

    public void selectById(int id){

    }

    public void updateByid(int id){

    }
}
