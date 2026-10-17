package service.inputports;

import domain.Inventario;

public interface InventarioServiceInterface {

    public Inventario createInventario(Integer idInventario, Integer cantidadDisponible, Integer stockMinimo, int idProducto);
    public Inventario consultarStock(int idInventario);
    public Inventario actualizarStock(int idInventario, Integer cantidadDisponible);
}
