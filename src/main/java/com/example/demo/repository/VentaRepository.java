package com.example.demo.repository;

import com.example.demo.entities.Venta;
import com.example.demo.entities.Cliente;
import com.example.demo.entities.Producto;

import java.util.Date;
import java.util.List;

public class VentaRepository {

    public List<Venta> findByCliente(Cliente cliente) {
        // Lógica para buscar ventas por cliente
        return null;
    }

    public List<Venta> findByProducto(Producto producto) {
        // Lógica para buscar ventas por producto
        return null;
    }

    public List<Venta> findByFechaBetween(Date startDate, Date endDate) {
        // Lógica para buscar ventas entre dos fechas
        return null;
    }

    public List<Venta> findByClienteAndProducto(Cliente cliente, Producto producto) {
        // Lógica para buscar ventas por cliente y producto
        return null;
    }
}
