package view;

import domain.Tienda;
import service.inputports.TiendaServiceInterface;

public class TiendaView {

    private final TiendaServiceInterface tiendaServiceInterface;

    public TiendaView(TiendaServiceInterface tiendaServiceInterface) {
        this.tiendaServiceInterface = tiendaServiceInterface;
    }

    public void createTienda() {
        int id = DataTypeValidator.validateInt("Ingrese el id");
        String name = DataTypeValidator.validateString("Ingrese el nombre");
        String lastName = DataTypeValidator.validateString("Ingrese el apellido");
        String phone = DataTypeValidator.validateString("Ingrese el telefono");
        String email = DataTypeValidator.validateString("Ingrese el correo");
        String password = DataTypeValidator.validateString("Ingrese la contraseña");
        boolean state = DataTypeValidator.validateInt("Estado: 1. Activo 2. Inactivo") == 1;
        String nombreTienda = DataTypeValidator.validateString("Ingrese el nombre de la tienda");

        tiendaServiceInterface.createTienda(id, name, lastName, phone, email, password, state, nombreTienda);
        System.out.println("Registrado correctamente");
    }

    public void selectAllTiendas() {
        for (Tienda tienda : tiendaServiceInterface.selectAllTiendas()) {
            print(tienda);
        }
    }

    public void selectTiendaById(int id) {
        Tienda tienda = tiendaServiceInterface.selectTiendaById(id);
        if (tienda == null) {
            System.out.println("No existe el id " + id);
        } else {
            print(tienda);
        }
    }

    private void print(Tienda tienda) {
        System.out.println(tienda.getId() + " | " + tienda.getName() + " " + tienda.getLastName()
                + " | Tienda: " + tienda.getNombreTienda() + " | Activo: " + tienda.isState());
    }
}
