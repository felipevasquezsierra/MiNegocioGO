package repository;

import domain.Pedido;
import service.outputports.PedidoRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepositoryAdapter implements PedidoRepositoryPort {

    List<Pedido> pedidos = new ArrayList<>();

    @Override
    public Pedido save(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    @Override
    public Pedido selectById(int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getIdPedido() == id) {
                return pedido;
            }
        }
        return null;
    }

    @Override
    public List<Pedido> selectAll() {
        return pedidos;
    }

    @Override
    public Pedido update(Pedido pedido) {
        deleteById(pedido.getIdPedido());
        pedidos.add(pedido);
        return pedido;
    }

    @Override
    public void deleteById(int id) {
        pedidos.removeIf(pedido -> pedido.getIdPedido() == id);
    }
}
