package repository;

import domain.ReporteVentas;
import service.outputports.ReporteVentasRepositoryPort;

import java.util.ArrayList;
import java.util.List;

public class ReporteVentasRepositoryAdapter implements ReporteVentasRepositoryPort {

    List<ReporteVentas> reportes = new ArrayList<>();

    @Override
    public ReporteVentas save(ReporteVentas reporteVentas) {
        reportes.add(reporteVentas);
        return reporteVentas;
    }

    @Override
    public List<ReporteVentas> selectAll() {
        return reportes;
    }
}
