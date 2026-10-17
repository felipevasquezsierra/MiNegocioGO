package repository;

import domain.Pago;
import service.outputports.PagoRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class PagoRepositoryAdapter implements PagoRepositoryPort {

    List<Pago> pagos = new ArrayList<>();

    @Override
    public Pago save(Pago pago) {
        pagos.add(pago);
        return pago;
    }

    @Override
    public Pago selectById(int id) {
        for (Pago pago : pagos) {
            if (pago.getIdPago() == id) {
                return pago;
            }
        }
        return null;
    }

    @Override
    public List<Pago> selectAll() {
        return pagos;
    }
}
