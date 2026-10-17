package service.inputports;

import domain.producto;

import java.util.List;

public interface ProductoServiceInterface {

    public producto createProducto(Integer idProducto, String nombre, double precio, int stock, boolean disponible);
    public List<producto> selectAllProductos();
    public producto selectProductoById(int idProducto);
    public producto updateProducto(Integer idProducto, String nombre, double precio, int stock, boolean disponible);
    public void deleteProducto(int idProducto);
}
