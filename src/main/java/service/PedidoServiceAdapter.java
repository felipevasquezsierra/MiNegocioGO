package service;

import domain.Cliente;
import domain.Pedido;
import domain.producto;
import service.inputports.PedidoServiceInterface;
import service.outputports.ClienteRepositoryPort;
import service.outputports.PedidoRepositoryPort;
import service.outputports.ProductoRepositoryPort;

import java.util.List;

public class PedidoServiceAdapter implements PedidoServiceInterface {

    private final PedidoRepositoryPort pedidoRepositoryPort;
    private final ClienteRepositoryPort clienteRepositoryPort;
    private final ProductoRepositoryPort productoRepositoryPort;

    public PedidoServiceAdapter(PedidoRepositoryPort pedidoRepositoryPort, ClienteRepositoryPort clienteRepositoryPort, ProductoRepositoryPort productoRepositoryPort) {
        this.pedidoRepositoryPort = pedidoRepositoryPort;
        this.clienteRepositoryPort = clienteRepositoryPort;
        this.productoRepositoryPort = productoRepositoryPort;
    }

    @Override
    public Pedido createPedido(Integer idPedido, String fecha, String estado, int idCliente, int idProducto) {
        Cliente cliente = clienteRepositoryPort.selectById(idCliente);
        producto producto = productoRepositoryPort.selectById(idProducto);
        if (cliente == null || producto == null) {
            return null;
        }
        // El total del pedido es el precio del producto. El pago se agrega después.
        Pedido pedido = new Pedido(idPedido, fecha, producto.getPrecio(), estado, cliente, producto, null);
        return pedidoRepositoryPort.save(pedido);
    }

    @Override
    public List<Pedido> selectAllPedidos() {
        return pedidoRepositoryPort.selectAll();
    }

    @Override
    public Pedido selectPedidoById(int idPedido) {
        return pedidoRepositoryPort.selectById(idPedido);
    }

    @Override
    public Pedido updatePedido(int idPedido, String estado) {
        Pedido pedido = pedidoRepositoryPort.selectById(idPedido);
        if (pedido == null) {
            return null;
        }
        pedido.setEstado(estado);
        return pedidoRepositoryPort.update(pedido);
    }

    @Override
    public void deletePedido(int idPedido) {
        pedidoRepositoryPort.deleteById(idPedido);
    }
}
