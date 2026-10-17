package view;

import domain.Venta;
import service.inputports.VentaServiceInterface;

public class VentaView {

    private final VentaServiceInterface ventaServiceInterface;

    public VentaView(VentaServiceInterface ventaServiceInterface) {
        this.ventaServiceInterface = ventaServiceInterface;
    }

    public void createVenta() {
        int id = DataTypeValidator.validateInt("Ingrese el id de la venta");
        String fecha = DataTypeValidator.validateString("Ingrese la fecha (AAAA-MM-DD)");
        int idPedido = DataTypeValidator.validateInt("Ingrese el id del pedido");
        int idTienda = DataTypeValidator.validateInt("Ingrese el id de la tienda");

        Venta venta = ventaServiceInterface.createVenta(id, fecha, "Completada", idPedido, idTienda);
        if (venta == null) {
            System.out.println("El pedido o la tienda no existen");
        } else {
            System.out.println("Venta registrada. Total: $" + venta.getTotal());
        }
    }

    public void selectAllVentas() {
        for (Venta venta : ventaServiceInterface.selectAllVentas()) {
            print(venta);
        }
    }

    public void selectVentaById(int id) {
        Venta venta = ventaServiceInterface.selectVentaById(id);
        if (venta == null) {
            System.out.println("No existe la venta " + id);
        } else {
            print(venta);
        }
    }

    private void print(Venta venta) {
        System.out.println(venta.getIdVenta() + " | " + venta.getFecha() + " | Pedido: " + venta.getPedido().getIdPedido()
                + " | Tienda: " + venta.getTienda().getNombreTienda() + " | Total: $" + venta.getTotal()
                + " | " + venta.getEstado());
    }
}
