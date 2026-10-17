package service.outputports;

import domain.Inventario;

import java.util.List;

public interface InventarioRepositoryPort {

    public Inventario save(Inventario inventario);
    public Inventario selectById(int id);
    public List<Inventario> selectAll();
}
