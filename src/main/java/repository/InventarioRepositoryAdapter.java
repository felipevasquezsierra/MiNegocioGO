package repository;

import domain.Inventario;
import service.outputports.InventarioRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class InventarioRepositoryAdapter implements InventarioRepositoryPort {

    List<Inventario> inventarios = new ArrayList<>();

    @Override
    public Inventario save(Inventario inventario) {
        inventarios.add(inventario);
        return inventario;
    }

    @Override
    public Inventario selectById(int id) {
        for (Inventario inventario : inventarios) {
            if (inventario.getIdInventario() == id) {
                return inventario;
            }
        }
        return null;
    }

    @Override
    public List<Inventario> selectAll() {
        return inventarios;
    }
}
