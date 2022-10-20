package com.mintic.casadeportiva.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mintic.casadeportiva.model.Product;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{Precio: {$lte: ?0}}")
    public List<Product> getLTEProduct(double precio);

    @Query("{Categoria: ?0}")
    public List<Product> getByCategory(String category);

    @Query("{Nombre: ?0}")
    public List<Product> getByName(String nombre);
}
