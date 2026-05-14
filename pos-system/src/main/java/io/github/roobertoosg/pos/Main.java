package io.github.roobertoosg.pos;

import models.DetalleVenta;
import models.Producto;
import models.Usuario;
import models.Venta;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.println("-- INICIANDO SISTEMA DE PUNTO DE VENTA --");

        Usuario cajeroEnTurno = new Usuario("roobertoosg", "password123", "Roberto S", "ADMIN");
        Producto cocaCola = new Producto( "001", "Coca Cola 600ml", "Pieza", 10.00, 15.00, "Refrescos");
        Producto doritosNacho = new Producto( "002", "Doritos Nacho 150g", "Pieza", 20.00, 35.00, "Barcel");

        List<DetalleVenta> carrito = new ArrayList<>();
        DetalleVenta detalle1 = new DetalleVenta(cocaCola, 2);
        DetalleVenta detalle2 = new DetalleVenta(doritosNacho, 1);
        
        carrito.add(detalle1);
        carrito.add(detalle2);


        Venta ventaActual = new Venta("TKT-001", "2024-06-01 12:00:00", cajeroEnTurno, carrito);
        ventaActual.calcularTotal();

        System.out.println("\n=================================");
        System.out.println("           TIENDA CARO            ");
        System.out.println("=================================");
        System.out.println("carrito");
        System.out.println("Folio: " + ventaActual.getFolio());
        System.out.println("Fecha: " + ventaActual.getFecha());

        System.out.println("Cajero: " + ventaActual.getCajero().getNombreCompleto());
        System.out.println("---------------------------------");
        for (DetalleVenta detalle : ventaActual.getListaDetalles()) {
            String nombreProd = detalle.getProducto().getDescripcion();

            System.out.println(nombreProd + "(x" + detalle.getCantidad() + ") ...$" + detalle.getSubtotal());
        }

        System.out.println("---------------------------------");
        System.out.println("TOTAL: $" + ventaActual.getTotal());
        System.out.println("=================================\n");
    }
}