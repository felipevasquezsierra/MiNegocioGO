package repository;

import domain.Cliente;
import service.outputports.ClienteRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryAdapter implements ClienteRepositoryPort {

    List<Cliente> clientes = new ArrayList<>();

    @Override
    public Cliente save(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    @Override
    public Cliente selectById(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> selectAll() {
        return clientes;
    }
}
