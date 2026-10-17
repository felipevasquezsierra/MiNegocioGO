package service.outputports;

import domain.ReporteVentas;

import java.util.List;

public interface ReporteVentasRepositoryPort {

    public ReporteVentas save(ReporteVentas reporteVentas);
    public List<ReporteVentas> selectAll();
}
