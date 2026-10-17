package service.outputports;

import domain.Cliente;

import java.util.List;

public interface ClienteRepositoryPort {

    public Cliente save(Cliente cliente);
    public Cliente selectById(int id);
    public List<Cliente> selectAll();
}
