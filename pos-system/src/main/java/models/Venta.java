package models;

import java.util.List;

public class Venta {

    private String folio;
    private String fecha;
    private Usuario cajero;
    private List<DetalleVenta> listaDetalles;
    private double total;
    
    public Venta(String folio, String fecha, Usuario cajero, List<DetalleVenta> listaDetalles) {
        this.folio = folio;
        this.fecha = fecha;
        this.cajero = cajero;
        this.listaDetalles = listaDetalles;
        this.total = 0.0;
    }

    public void calcularTotal() {
        this.total = 0.0;
        for (DetalleVenta detalle: listaDetalles) {
            this.total = this.total + detalle.getSubtotal();
        }
    }

    // Getters y setters

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getCajero() {
        return cajero;
    }

    public void setCajero(Usuario cajero) {
        this.cajero = cajero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleVenta> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<DetalleVenta> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }
    

}
