package com.mintic.casadeportiva.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Product {

    @Id
    private String id;
    @Field
    private String Categoria;
    @Field
    private String Nombre;
    @Field
    private String Descripcion;
    @Field
    private double Precio;
    @Field
    private boolean Disponible = true;
    @Field
    private Integer Stock;
    @Field
    private String ImgRoute;

    public Product(){

    }

    public Product(String id,String categoria, String nombre, String descripcion, double precio,Integer stock, String imgRoute){
        setId(id);
        setCategoria(categoria);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setStock(stock);
        setImgRoute(imgRoute);
    }

    public Product(String categoria, String nombre, String descripcion, double precio,Integer stock, String imgRoute){
        setCategoria(categoria);
        setNombre(nombre);
        setDescripcion(descripcion);
        setPrecio(precio);
        setStock(stock);
        setImgRoute(imgRoute);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public String getImgRoute() {
        return ImgRoute;
    }

    public void setImgRoute(String imgRoute) {
        ImgRoute = imgRoute;
    }
}
