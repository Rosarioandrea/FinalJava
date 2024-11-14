package com.example.demo.repository;

import com.example.demo.entities.Producto;

import java.util.List;

public class ProductoRepository {

    public List<Producto> findByNombre(String nombre) {
        // Lógica para buscar productos por nombre
        return null;
    }

    public List<Producto> findByPrecioBetween(Double minPrice, Double maxPrice) {
        // Lógica para buscar productos dentro de un rango de precios
        return null;
    }

    public List<Producto> findByNombreContaining(String term) {
        // Lógica para buscar productos cuyo nombre contenga el término
        return null;
    }
}
