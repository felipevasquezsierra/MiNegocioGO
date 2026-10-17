package ui;

import service.validators.DataTypeValidator;
import view.*;

public class CliUserInterface {

    private final ClienteView clienteView;
    private final TiendaView tiendaView;
    private final ProductoView productoView;
    private final InventarioView inventarioView;
    private final PedidoView pedidoView;
    private final PagoView pagoView;
    private final VentaView ventaView;
    private final ReporteVentasView reporteVentasView;

    public CliUserInterface(ClienteView clienteView, TiendaView tiendaView, ProductoView productoView,
                            InventarioView inventarioView, PedidoView pedidoView, PagoView pagoView,
                            VentaView ventaView, ReporteVentasView reporteVentasView) {
        this.clienteView = clienteView;
        this.tiendaView = tiendaView;
        this.productoView = productoView;
        this.inventarioView = inventarioView;
        this.pedidoView = pedidoView;
        this.pagoView = pagoView;
        this.ventaView = ventaView;
        this.reporteVentasView = reporteVentasView;
    }

    public void applicationInit() {

        System.out.println("Bienvenido a MiNegocioGO");

        int option = -1;
        while (option != 0) {

            option = DataTypeValidator.validateInt("""
                    
                    1. Clientes
                    2. Tiendas
                    3. Productos
                    4. Inventario
                    5. Pedidos
                    6. Pagos
                    7. Ventas
                    8. Reporte de ventas
                    0. Salir""");

            switch (option) {
                case 1:
                    clienteMenu();
                    break;
                case 2:
                    tiendaMenu();
                    break;
                case 3:
                    productoMenu();
                    break;
                case 4:
                    inventarioMenu();
                    break;
                case 5:
                    pedidoMenu();
                    break;
                case 6:
                    pagoMenu();
                    break;
                case 7:
                    ventaMenu();
                    break;
                case 8:
                    reporteVentasView.generarReporte();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación");
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        }
    }

    public void clienteMenu() {
        int option = DataTypeValidator.validateInt("1. Registrar cliente 2. Consultar todos 3. Consultar por id");
        switch (option) {
            case 1:
                clienteView.createCliente();
                break;
            case 2:
                clienteView.selectAllClientes();
                break;
            case 3:
                clienteView.selectClienteById(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void tiendaMenu() {
        int option = DataTypeValidator.validateInt("1. Registrar tienda 2. Consultar todas 3. Consultar por id");
        switch (option) {
            case 1:
                tiendaView.createTienda();
                break;
            case 2:
                tiendaView.selectAllTiendas();
                break;
            case 3:
                tiendaView.selectTiendaById(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void productoMenu() {
        int option = DataTypeValidator.validateInt("1. Registrar 2. Consultar todos 3. Consultar por id 4. Actualizar 5. Eliminar");
        switch (option) {
            case 1:
                productoView.createProducto();
                break;
            case 2:
                productoView.selectAllProductos();
                break;
            case 3:
                productoView.selectProductoById(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            case 4:
                productoView.updateProducto();
                break;
            case 5:
                productoView.deleteProducto(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void inventarioMenu() {
        int option = DataTypeValidator.validateInt("1. Registrar inventario 2. Consultar stock 3. Actualizar stock");
        switch (option) {
            case 1:
                inventarioView.createInventario();
                break;
            case 2:
                inventarioView.consultarStock(DataTypeValidator.validateInt("Ingrese el id del inventario"));
                break;
            case 3:
                inventarioView.actualizarStock();
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void pedidoMenu() {
        int option = DataTypeValidator.validateInt("1. Registrar 2. Consultar todos 3. Consultar por id 4. Actualizar estado 5. Eliminar");
        switch (option) {
            case 1:
                pedidoView.createPedido();
                break;
            case 2:
                pedidoView.selectAllPedidos();
                break;
            case 3:
                pedidoView.selectPedidoById(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            case 4:
                pedidoView.updatePedido();
                break;
            case 5:
                pedidoView.deletePedido(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void pagoMenu() {
        int option = DataTypeValidator.validateInt("1. Procesar pago 2. Consultar por id");
        switch (option) {
            case 1:
                pagoView.procesarPago();
                break;
            case 2:
                pagoView.selectPagoById(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }

    public void ventaMenu() {
        int option = DataTypeValidator.validateInt("1. Registrar venta 2. Consultar todas 3. Consultar por id");
        switch (option) {
            case 1:
                ventaView.createVenta();
                break;
            case 2:
                ventaView.selectAllVentas();
                break;
            case 3:
                ventaView.selectVentaById(DataTypeValidator.validateInt("Ingrese el id"));
                break;
            default:
                System.out.println("Ingrese una opción valida");
        }
    }
}
