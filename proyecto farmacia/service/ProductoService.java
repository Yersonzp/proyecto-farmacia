package service;

import java.util.ArrayList;
import java.util.List;
import Farmacia.Producto;

public class ProductoService {
    public static List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> getAllProducto() {
        return listaProductos;   
    }

    public void addProducto (Producto producto) { 
        listaProductos.add(producto); 
    }

    public Producto getById(Object object){
        for (Producto p : listaProductos){

        }

        return null;
    }

    public void edit( Producto producto) {
        Producto p = getById(producto.getId());
        p.setCodigo(producto.getCodigo());
        p.setNombre(producto.getNombre());
        p.setPrecio_unitario(producto.getPrecio_unitario());
        addProducto(producto);
    }

    public void delete(String id) {
        Producto producto = null;
        for (Producto p : getAllProducto()) {
            if (p.getId().equals(id)) {
                producto = p;
                break;
                
            }

        }
        if (producto !=null)
        getAllProducto().remove (producto);

    }

    public void listar() {
        list <Producto> producto = new ArrayList<>();
        
    }
}
