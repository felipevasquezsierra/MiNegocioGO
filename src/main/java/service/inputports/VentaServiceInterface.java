package service.inputports;

import domain.Venta;

import java.util.List;

public interface VentaServiceInterface {

    public Venta createVenta(Integer idVenta, String fecha, String estado, int idPedido, int idTienda);
    public List<Venta> selectAllVentas();
    public Venta selectVentaById(int idVenta);
}
