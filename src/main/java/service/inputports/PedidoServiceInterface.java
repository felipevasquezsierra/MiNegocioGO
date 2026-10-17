package service.inputports;

import domain.Pedido;

import java.util.List;

public interface PedidoServiceInterface {

    public Pedido createPedido(Integer idPedido, String fecha, String estado, int idCliente, int idProducto);
    public List<Pedido> selectAllPedidos();
    public Pedido selectPedidoById(int idPedido);
    public Pedido updatePedido(int idPedido, String estado);
    public void deletePedido(int idPedido);
}
