package service.inputports;

import domain.Pago;

public interface PagoServiceInterface {

    public Pago procesarPago(Integer idPago, double monto, String metodo, String fecha, int idPedido);
    public Pago selectPagoById(int idPago);
}
