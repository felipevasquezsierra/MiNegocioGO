package service.outputports;

import domain.producto;

import java.util.List;

public interface ProductoRepositoryPort {

    public producto save(producto producto);
    public producto selectById(int id);
    public List<producto> selectAll();
    public producto update(producto producto);
    public void deleteById(int id);
}
