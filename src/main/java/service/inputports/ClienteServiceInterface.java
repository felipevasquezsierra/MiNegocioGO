package service.inputports;

import domain.Cliente;

import java.util.List;

public interface ClienteServiceInterface {

    public Cliente createCliente(Integer id, String name, String lastName, String phone, String email, String password, boolean state, String direccionEntrega);
    public List<Cliente> selectAllClientes();
    public Cliente selectClienteById(int id);
}
