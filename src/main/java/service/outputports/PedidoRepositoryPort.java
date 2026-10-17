package service.outputports;

import domain.Pedido;

import java.util.List;

public interface PedidoRepositoryPort {

    public Pedido save(Pedido pedido);
    public Pedido selectById(int id);
    public List<Pedido> selectAll();
    public Pedido update(Pedido pedido);
    public void deleteById(int id);
}
