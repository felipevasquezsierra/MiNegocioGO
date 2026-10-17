package service;

import domain.producto;
import service.inputports.ProductoServiceInterface;
import service.outputports.ProductoRepositoryPort;

import java.util.List;

public class ProductoServiceAdapter implements ProductoServiceInterface {

    private final ProductoRepositoryPort productoRepositoryPort;

    public ProductoServiceAdapter(ProductoRepositoryPort productoRepositoryPort) {
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public producto createProducto(Integer idProducto, String nombre, double precio, int stock, boolean disponible) {
        producto producto = new producto(idProducto, nombre, precio, stock, disponible);
        return productoRepositoryPort.save(producto);
    }

    @Override
    public List<producto> selectAllProductos() {
        return productoRepositoryPort.selectAll();
    }

    @Override
    public producto selectProductoById(int idProducto) {
        return productoRepositoryPort.selectById(idProducto);
    }

    @Override
    public producto updateProducto(Integer idProducto, String nombre, double precio, int stock, boolean disponible) {
        producto producto = new producto(idProducto, nombre, precio, stock, disponible);
        return productoRepositoryPort.update(producto);
    }

    @Override
    public void deleteProducto(int idProducto) {
        productoRepositoryPort.deleteById(idProducto);
    }
}
