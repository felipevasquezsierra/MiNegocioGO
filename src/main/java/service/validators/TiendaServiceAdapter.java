package service.validators;

import domain.Tienda;
import service.inputports.TiendaServiceInterface;
import service.outputports.TiendaRepositoryPort;

import java.util.List;

public class TiendaServiceAdapter implements TiendaServiceInterface {

    private final TiendaRepositoryPort tiendaRepositoryPort;

    public TiendaServiceAdapter(TiendaRepositoryPort tiendaRepositoryPort) {
        this.tiendaRepositoryPort = tiendaRepositoryPort;
    }

    @Override
    public Tienda createTienda(Integer id, String name, String lastName, String phone, String email, String password, boolean state, String nombreTienda) {
        Tienda tienda = new Tienda(id, name, lastName, phone, email, password, state, nombreTienda);
        return tiendaRepositoryPort.save(tienda);
    }

    @Override
    public List<Tienda> selectAllTiendas() {
        return tiendaRepositoryPort.selectAll();
    }

    @Override
    public Tienda selectTiendaById(int id) {
        return tiendaRepositoryPort.selectById(id);
    }
}
