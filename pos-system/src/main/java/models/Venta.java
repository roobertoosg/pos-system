package models;

import java.util.List;

public class Venta {

    private String folio;
    private String fecha;
    private Usuario cajero;
    private List<Producto> listaProductos;
    private double total;
    
    public Venta(String folio, String fecha, Usuario cajero, List<Producto> listaProductos) {
        this.folio = folio;
        this.fecha = fecha;
        this.cajero = cajero;
        this.listaProductos = listaProductos;
        this.total = 0.0;
    }

    public void calcularTotal() {
        this.total = 0.0;
        for (Producto p: listaProductos) {
            this.total = this.total + p.getPrecioVenta();
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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

}
