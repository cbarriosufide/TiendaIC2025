/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Item extends Producto{
    private int cantidad;
    
    public Item(Producto producto){
        super.setIdProducto(producto.getIdProducto());
        super.setCategoria(producto.getCategoria());
        super.setDescripcion(producto.getDescripcion());
        super.setPrecio(producto.getPrecio());
        super.setDetalle(producto.getDetalle());
        super.setExistencias(producto.getExistencias());
        super.setActivo(producto.isActivo());
        super.setRutaImagen(producto.getRutaImagen());
        this.cantidad = 0;
    }
}
