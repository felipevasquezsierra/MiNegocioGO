package service;

import domain.Pago;
import domain.Pedido;
import service.inputports.PagoServiceInterface;
import service.outputports.PagoRepositoryPort;
import service.outputports.PedidoRepositoryPort;

public class PagoServiceAdapter implements PagoServiceInterface {

    private final PagoRepositoryPort pagoRepositoryPort;
    private final PedidoRepositoryPort pedidoRepositoryPort;

    public PagoServiceAdapter(PagoRepositoryPort pagoRepositoryPort, PedidoRepositoryPort pedidoRepositoryPort) {
        this.pagoRepositoryPort = pagoRepositoryPort;
        this.pedidoRepositoryPort = pedidoRepositoryPort;
    }

    @Override
    public Pago procesarPago(Integer idPago, double monto, String metodo, String fecha, int idPedido) {
        Pedido pedido = pedidoRepositoryPort.selectById(idPedido);
        if (pedido == null) {
            return null;
        }
        Pago pago = new Pago(idPago, monto, metodo, "Aprobado", fecha, pedido);
        // Se conecta el pago con el pedido
        pedido.setPago(pago);
        pedido.setEstado("Pagado");
        return pagoRepositoryPort.save(pago);
    }

    @Override
    public Pago selectPagoById(int idPago) {
        return pagoRepositoryPort.selectById(idPago);
    }
}
