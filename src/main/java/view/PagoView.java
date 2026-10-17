package view;

import domain.Pago;
import service.inputports.PagoServiceInterface;

public class PagoView {

    private final PagoServiceInterface pagoServiceInterface;

    public PagoView(PagoServiceInterface pagoServiceInterface) {
        this.pagoServiceInterface = pagoServiceInterface;
    }

    public void procesarPago() {
        int id = DataTypeValidator.validateInt("Ingrese el id del pago");
        int idPedido = DataTypeValidator.validateInt("Ingrese el id del pedido");
        double monto = DataTypeValidator.validateDouble("Ingrese el monto");
        String metodo = DataTypeValidator.validateString("Ingrese el método (Efectivo, Tarjeta, Transferencia)");
        String fecha = DataTypeValidator.validateString("Ingrese la fecha (AAAA-MM-DD)");

        if (pagoServiceInterface.procesarPago(id, monto, metodo, fecha, idPedido) == null) {
            System.out.println("No existe el pedido " + idPedido);
        } else {
            System.out.println("Pago procesado");
        }
    }

    public void selectPagoById(int id) {
        Pago pago = pagoServiceInterface.selectPagoById(id);
        if (pago == null) {
            System.out.println("No existe el pago " + id);
        } else {
            System.out.println(pago.getIdPago() + " | Pedido: " + pago.getPedido().getIdPedido() + " | $" + pago.getMonto()
                    + " | " + pago.getMetodo() + " | " + pago.getEstado() + " | " + pago.getFecha());
        }
    }
}
