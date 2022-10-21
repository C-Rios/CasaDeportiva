package com.mintic.casadeportiva.controller;

import com.mintic.casadeportiva.model.Product;
import com.mintic.casadeportiva.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @CrossOrigin(origins="*")
    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    @CrossOrigin(origins="*")
    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }
    @CrossOrigin(origins="*")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        productService.deleteProduct(id);
    }
    @CrossOrigin(origins="*")
    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable("id")String id){
        return productService.getByID(id);
    }

    @GetMapping("/lte/{precio}")
    public List<Product> getLTEProduct(@PathVariable("precio")double precio){
        return productService.productsPrecioMenor(precio);
    }

    @GetMapping("/category/{category}")
    public List<Product> getCategory(@PathVariable("category")String category){
        return productService.productsByCategory(category);
    }

    @GetMapping("/category/all")
    public List<String> getAllCategories(){
        return productService.getAllCategories();
    }
    @GetMapping("/searchByName/{name}")
    public List<Product> getName(@PathVariable("name")String name){
        return productService.productByName(name);
    }

}
