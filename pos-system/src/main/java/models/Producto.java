package models;

public class Producto {
    private String codigo;
    private String descripcion;
    private String tipoVenta;
    private double precioCosto;
    private double precioVenta;
    private String departamento;

    public Producto(String codigo, String descripcion, String tipoVenta, double precioCosto, double precioVenta, String departamento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipoVenta = tipoVenta;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.departamento = departamento;
    }
    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    


}
