package service.validators;

import domain.Cliente;
import service.inputports.ClienteServiceInterface;
import service.outputports.ClienteRepositoryPort;

import java.util.List;

public class ClienteServiceAdapter implements ClienteServiceInterface {

    private final ClienteRepositoryPort clienteRepositoryPort;

    public ClienteServiceAdapter(ClienteRepositoryPort clienteRepositoryPort) {
        this.clienteRepositoryPort = clienteRepositoryPort;
    }

    @Override
    public Cliente createCliente(Integer id, String name, String lastName, String phone, String email, String password, boolean state, String direccionEntrega) {
        Cliente cliente = new Cliente(direccionEntrega);
        cliente.setId(id);
        cliente.setName(name);
        cliente.setLastName(lastName);
        cliente.setPhone(phone);
        cliente.setEmail(email);
        cliente.setPassword(password);
        cliente.setState(state);
        return clienteRepositoryPort.save(cliente);
    }

    @Override
    public List<Cliente> selectAllClientes() {
        return clienteRepositoryPort.selectAll();
    }

    @Override
    public Cliente selectClienteById(int id) {
        return clienteRepositoryPort.selectById(id);
    }
}
