package com.mintic.casadeportiva.service;

import com.mintic.casadeportiva.model.Product;
import com.mintic.casadeportiva.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product update(Product product){
        if(!productRepository.findById(product.getId()).isEmpty()){
            Optional<Product> aux = productRepository.findById(product.getId());
            Product myprod = aux.get();
            if(product.getCategoria()!=null)
                myprod.setCategoria(product.getCategoria());
            if(product.getStock()!=null)
                myprod.setStock(product.getStock());
            if(product.getPrecio()!=0.0)
                myprod.setPrecio(product.getPrecio());
            if(product.getImgRoute()!=null)
                myprod.setImgRoute(product.getImgRoute());
            if(product.getDescripcion()!=null)
                myprod.setDescripcion(product.getDescripcion());
            if(product.getNombre()!=null)
                myprod.setNombre(product.getNombre());

            productRepository.save(myprod);
            return myprod;
        }else
            return null;
    }

    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }

    public Optional<Product> getByID(String id){
        return productRepository.findById(id);
    }

    public List<Product> productsPrecioMenor(double precio){
        return (List<Product>) productRepository.getLTEProduct(precio);
    }

    public List<Product> productsByCategory(String category){
        return (List<Product>) productRepository.getByCategory(category);
    }

    public List<Product> productByName(String name){
        return (List<Product>) productRepository.getByName(name);
    }
}
