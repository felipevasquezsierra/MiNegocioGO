package domain;

public class producto {

    private Integer idProducto;
    private String nombre;
    private double precio;
    private int stock;
    private boolean disponible;

    public producto(){

    }

    public producto(Integer idProducto, String nombre, double precio, int stock, boolean disponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
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
