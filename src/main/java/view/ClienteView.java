package view;

import domain.Cliente;
import service.inputports.ClienteServiceInterface;
import service.validators.DataTypeValidator;

public class ClienteView {

    private final ClienteServiceInterface clienteServiceInterface;

    public ClienteView(ClienteServiceInterface clienteServiceInterface) {
        this.clienteServiceInterface = clienteServiceInterface;
    }

    public void createCliente() {
        int id = DataTypeValidator.validateInt("Ingrese el id");
        String name = DataTypeValidator.validateString("Ingrese el nombre");
        String lastName = DataTypeValidator.validateString("Ingrese el apellido");
        String phone = DataTypeValidator.validateString("Ingrese el telefono");
        String email = DataTypeValidator.validateString("Ingrese el correo");
        String password = DataTypeValidator.validateString("Ingrese la contraseña");
        boolean state = DataTypeValidator.validateInt("Estado: 1. Activo 2. Inactivo") == 1;
        String direccionEntrega = DataTypeValidator.validateString("Ingrese la dirección de entrega");

        clienteServiceInterface.createCliente(id, name, lastName, phone, email, password, state, direccionEntrega);
        System.out.println("Registrado correctamente");
    }

    public void selectAllClientes() {
        for (Cliente cliente : clienteServiceInterface.selectAllClientes()) {
            print(cliente);
        }
    }

    public void selectClienteById(int id) {
        Cliente cliente = clienteServiceInterface.selectClienteById(id);
        if (cliente == null) {
            System.out.println("No existe el id " + id);
        } else {
            print(cliente);
        }
    }

    private void print(Cliente cliente) {
        System.out.println(cliente.getId() + " | " + cliente.getName() + " " + cliente.getLastName()
                + " | Dirección: " + cliente.getDireccionEntrega() + " | Activo: " + cliente.isState());
    }
}
