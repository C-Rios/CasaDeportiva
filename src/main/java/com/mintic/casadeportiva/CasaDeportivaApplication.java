package com.mintic.casadeportiva;

import com.mintic.casadeportiva.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mintic.casadeportiva.repository.ProductRepository;

@SpringBootApplication
public class CasaDeportivaApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;


    /*
    * public CasaDeportivaApplication(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    * */

    public static void main(String[] args) {
        SpringApplication.run(CasaDeportivaApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception{
        productRepository.deleteAll();

        productRepository.save(new Product("Shorts","Nike Shorts M", "Nike shorts", 19.9, 60,""));
        productRepository.save(new Product("T-Shirts","Nike T-shirt", "Nike tshirt", 40, 150,""));
        productRepository.save(new Product("Running shoes","Nike Shoes", "Nike shoes", 79.9, 30,""));
        productRepository.save(new Product("Soccer ball","World Cup Ball", "Soccer ball", 50.9, 0,""));
        productRepository.save(new Product("Football ball","Classic football ball", "Classic football ball", 40.9, 60,""));

    }

}
