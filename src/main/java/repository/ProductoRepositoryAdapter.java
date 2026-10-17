package repository;

import domain.producto;
import service.outputports.ProductoRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryAdapter implements ProductoRepositoryPort {

    List<producto> productos = new ArrayList<>();

    @Override
    public producto save(producto producto) {
        productos.add(producto);
        return producto;
    }

    @Override
    public producto selectById(int id) {
        for (producto producto : productos) {
            if (producto.getIdProducto() == id) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public List<producto> selectAll() {
        return productos;
    }

    @Override
    public producto update(producto producto) {
        deleteById(producto.getIdProducto());
        productos.add(producto);
        return producto;
    }

    @Override
    public void deleteById(int id) {
        productos.removeIf(producto -> producto.getIdProducto() == id);
    }
}
