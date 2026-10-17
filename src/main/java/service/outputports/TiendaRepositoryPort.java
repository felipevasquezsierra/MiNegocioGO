package service.outputports;

import domain.Tienda;

import java.util.List;

public interface TiendaRepositoryPort {

    public Tienda save(Tienda tienda);
    public Tienda selectById(int id);
    public List<Tienda> selectAll();
}
