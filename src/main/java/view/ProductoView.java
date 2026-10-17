package view;

import domain.producto;
import service.inputports.ProductoServiceInterface;

public class ProductoView {

    private final ProductoServiceInterface productoServiceInterface;

    public ProductoView(ProductoServiceInterface productoServiceInterface) {
        this.productoServiceInterface = productoServiceInterface;
    }

    public void createProducto() {
        int id = DataTypeValidator.validateInt("Ingrese el id del producto");
        String nombre = DataTypeValidator.validateString("Ingrese el nombre del producto");
        double precio = DataTypeValidator.validateDouble("Ingrese el precio del producto");
        int stock = DataTypeValidator.validateInt("Ingrese el stock del producto");
        boolean disponible = DataTypeValidator.validateInt("Disponible: 1. Sí 2. No") == 1;

        productoServiceInterface.createProducto(id, nombre, precio, stock, disponible);
        System.out.println("Producto registrado");
    }

    public void selectAllProductos() {
        for (producto producto : productoServiceInterface.selectAllProductos()) {
            print(producto);
        }
    }

    public void selectProductoById(int id) {
        producto producto = productoServiceInterface.selectProductoById(id);
        if (producto == null) {
            System.out.println("No existe el producto " + id);
        } else {
            print(producto);
        }
    }

    public void updateProducto() {
        int id = DataTypeValidator.validateInt("Ingrese el id del producto a actualizar");
        String nombre = DataTypeValidator.validateString("Ingrese el nuevo nombre");
        double precio = DataTypeValidator.validateDouble("Ingrese el nuevo precio");
        int stock = DataTypeValidator.validateInt("Ingrese el nuevo stock");
        boolean disponible = DataTypeValidator.validateInt("Disponible: 1. Sí 2. No") == 1;

        productoServiceInterface.updateProducto(id, nombre, precio, stock, disponible);
        System.out.println("Producto actualizado");
    }

    public void deleteProducto(int id) {
        productoServiceInterface.deleteProducto(id);
        System.out.println("Producto eliminado");
    }

    private void print(producto producto) {
        System.out.println(producto.getIdProducto() + " | " + producto.getNombre() + " | $" + producto.getPrecio()
                + " | Stock: " + producto.getStock() + " | Disponible: " + producto.isDisponible());
    }
}
