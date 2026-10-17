package repository;

import domain.Tienda;
import service.outputports.TiendaRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class TiendaRepositoryAdapter implements TiendaRepositoryPort {

    List<Tienda> tiendas = new ArrayList<>();

    @Override
    public Tienda save(Tienda tienda) {
        tiendas.add(tienda);
        return tienda;
    }

    @Override
    public Tienda selectById(int id) {
        for (Tienda tienda : tiendas) {
            if (tienda.getId() == id) {
                return tienda;
            }
        }
        return null;
    }

    @Override
    public List<Tienda> selectAll() {
        return tiendas;
    }
}
