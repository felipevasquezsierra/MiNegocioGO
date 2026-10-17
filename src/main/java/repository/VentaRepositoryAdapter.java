package repository;

import domain.Venta;
import service.outputports.VentaRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class VentaRepositoryAdapter implements VentaRepositoryPort {

    List<Venta> ventas = new ArrayList<>();

    @Override
    public Venta save(Venta venta) {
        ventas.add(venta);
        return venta;
    }

    @Override
    public Venta selectById(int id) {
        for (Venta venta : ventas) {
            if (venta.getIdVenta() == id) {
                return venta;
            }
        }
        return null;
    }

    @Override
    public List<Venta> selectAll() {
        return ventas;
    }
}
