package service;

import domain.Inventario;
import domain.producto;
import service.inputports.InventarioServiceInterface;
import service.outputports.InventarioRepositoryPort;
import service.outputports.ProductoRepositoryPort;

public class InventarioServiceAdapter implements InventarioServiceInterface {

    private final InventarioRepositoryPort inventarioRepositoryPort;
    private final ProductoRepositoryPort productoRepositoryPort;

    public InventarioServiceAdapter(InventarioRepositoryPort inventarioRepositoryPort, ProductoRepositoryPort productoRepositoryPort) {
        this.inventarioRepositoryPort = inventarioRepositoryPort;
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Inventario createInventario(Integer idInventario, Integer cantidadDisponible, Integer stockMinimo, int idProducto) {
        producto producto = productoRepositoryPort.selectById(idProducto);
        if (producto == null) {
            return null;
        }
        Inventario inventario = new Inventario(idInventario, cantidadDisponible, stockMinimo, producto);
        return inventarioRepositoryPort.save(inventario);
    }

    @Override
    public Inventario consultarStock(int idInventario) {
        return inventarioRepositoryPort.selectById(idInventario);
    }

    @Override
    public Inventario actualizarStock(int idInventario, Integer cantidadDisponible) {
        Inventario inventario = inventarioRepositoryPort.selectById(idInventario);
        if (inventario == null) {
            return null;
        }
        inventario.setCantidadDisponible(cantidadDisponible);
        inventario.getProducto().setStock(cantidadDisponible);
        return inventario;
    }
}
