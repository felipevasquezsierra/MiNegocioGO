package domain;

public class Pedido {

    private Integer idPedido;
    private String fecha;
    private double total;
    private String estado;
    private Cliente cliente;
    private producto producto;
    private Pago pago;

    public Pedido(){

    }

    public Pedido(Integer idPedido, String fecha, double total, String estado, Cliente cliente, producto producto, Pago pago) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.cliente = cliente;
        this.producto = producto;
        this.pago = pago;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void create(){

    }

    public void selectAll(){
    }

    public void selectById(int id){

    }

    public void updateById(int id){

    }

    public void deleteById(int id){

    }
}
