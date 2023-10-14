package Farmacia;


public class Producto {
        private String nombre;
        private String codigo;
        private double precio_unitario;
    
        public Producto(String nombre, String codigo, double precio_unitario) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.precio_unitario = precio_unitario;
        }
    
        // Getters y setters
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getCodigo() {
            return codigo;
        }
    
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
    
        public double getPrecio_unitario() {
            return precio_unitario;
        }
    
        public void setPrecio_unitario(double precio_unitario) {
            this.precio_unitario = precio_unitario;
        }

        public Object getId() {
            return null;
        }
}
