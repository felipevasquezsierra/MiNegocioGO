package service.outputports;

import domain.Pago;

import java.util.List;

public interface PagoRepositoryPort {

    public Pago save(Pago pago);
    public Pago selectById(int id);
    public List<Pago> selectAll();
}
