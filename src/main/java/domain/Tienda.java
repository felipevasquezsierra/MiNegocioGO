package domain;

public class Tienda extends Person {

    private String nombreTienda;

    public Tienda(){

    }

        public Tienda(Integer id, String name, String lastName, String phone, String email, String password, boolean state, String nombreTienda) {
        super(id, name, lastName, phone, email, password, state);
        this.nombreTienda = nombreTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void create(){
        super.create();
    }

    public void selectAll(){
        super.selectAll();
    }

    public void selectById(int id){
        super.selectById(id);
    }
}
