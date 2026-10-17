package view;

import domain.Inventario;
import service.inputports.InventarioServiceInterface;
import service.validators.DataTypeValidator;

public class InventarioView {

    private final InventarioServiceInterface inventarioServiceInterface;

    public InventarioView(InventarioServiceInterface inventarioServiceInterface) {
        this.inventarioServiceInterface = inventarioServiceInterface;
    }

    public void createInventario() {
        int id = DataTypeValidator.validateInt("Ingrese el id del inventario");
        int idProducto = DataTypeValidator.validateInt("Ingrese el id del producto");
        int cantidad = DataTypeValidator.validateInt("Ingrese la cantidad disponible");
        int stockMinimo = DataTypeValidator.validateInt("Ingrese el stock mínimo");

        Inventario inventario = inventarioServiceInterface.createInventario(id, cantidad, stockMinimo, idProducto);
        if (inventario == null) {
            System.out.println("No existe el producto " + idProducto);
        } else {
            System.out.println("Inventario registrado");
        }
    }

    public void consultarStock(int id) {
        Inventario inventario = inventarioServiceInterface.consultarStock(id);
        if (inventario == null) {
            System.out.println("No existe el inventario " + id);
            return;
        }
        System.out.println(inventario.getProducto().getNombre() + " | Disponible: " + inventario.getCantidadDisponible()
                + " | Mínimo: " + inventario.getStockMinimo());
        if (inventario.getCantidadDisponible() <= inventario.getStockMinimo()) {
            System.out.println("¡Atención! El stock está en el mínimo o por debajo");
        }
    }

    public void actualizarStock() {
        int id = DataTypeValidator.validateInt("Ingrese el id del inventario");
        int cantidad = DataTypeValidator.validateInt("Ingrese la nueva cantidad disponible");

        if (inventarioServiceInterface.actualizarStock(id, cantidad) == null) {
            System.out.println("No existe el inventario " + id);
        } else {
            System.out.println("Stock actualizado");
        }
    }
}
