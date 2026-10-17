package service.outputports;

import domain.Venta;

import java.util.List;

public interface VentaRepositoryPort {

    public Venta save(Venta venta);
    public Venta selectById(int id);
    public List<Venta> selectAll();
}
