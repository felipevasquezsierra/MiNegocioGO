package service.inputports;

import domain.Tienda;

import java.util.List;

public interface TiendaServiceInterface {

    public Tienda createTienda(Integer id, String name, String lastName, String phone, String email, String password, boolean state, String nombreTienda);
    public List<Tienda> selectAllTiendas();
    public Tienda selectTiendaById(int id);
}
