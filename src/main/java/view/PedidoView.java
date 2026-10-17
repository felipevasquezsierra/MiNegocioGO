package view;

import domain.Pedido;
import service.inputports.PedidoServiceInterface;
import service.validators.DataTypeValidator;

public class PedidoView {

    private final PedidoServiceInterface pedidoServiceInterface;

    public PedidoView(PedidoServiceInterface pedidoServiceInterface) {
        this.pedidoServiceInterface = pedidoServiceInterface;
    }

    public void createPedido() {
        int id = DataTypeValidator.validateInt("Ingrese el id del pedido");
        String fecha = DataTypeValidator.validateString("Ingrese la fecha (AAAA-MM-DD)");
        int idCliente = DataTypeValidator.validateInt("Ingrese el id del cliente");
        int idProducto = DataTypeValidator.validateInt("Ingrese el id del producto");

        Pedido pedido = pedidoServiceInterface.createPedido(id, fecha, "Pendiente", idCliente, idProducto);
        if (pedido == null) {
            System.out.println("El cliente o el producto no existen");
        } else {
            System.out.println("Pedido registrado. Total: $" + pedido.getTotal());
        }
    }

    public void selectAllPedidos() {
        for (Pedido pedido : pedidoServiceInterface.selectAllPedidos()) {
            print(pedido);
        }
    }

    public void selectPedidoById(int id) {
        Pedido pedido = pedidoServiceInterface.selectPedidoById(id);
        if (pedido == null) {
            System.out.println("No existe el pedido " + id);
        } else {
            print(pedido);
        }
    }

    public void updatePedido() {
        int id = DataTypeValidator.validateInt("Ingrese el id del pedido");
        String estado = DataTypeValidator.validateString("Ingrese el nuevo estado (Pendiente, Pagado, Enviado, Entregado)");

        if (pedidoServiceInterface.updatePedido(id, estado) == null) {
            System.out.println("No existe el pedido " + id);
        } else {
            System.out.println("Pedido actualizado");
        }
    }

    public void deletePedido(int id) {
        pedidoServiceInterface.deletePedido(id);
        System.out.println("Pedido eliminado");
    }

    private void print(Pedido pedido) {
        System.out.println(pedido.getIdPedido() + " | " + pedido.getFecha() + " | Cliente: " + pedido.getCliente().getName()
                + " | Producto: " + pedido.getProducto().getNombre() + " | Total: $" + pedido.getTotal()
                + " | Estado: " + pedido.getEstado());
    }
}
