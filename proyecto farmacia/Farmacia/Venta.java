package Farmacia;

public class Venta {
        private int numero_factura;
        private String fecha;
        private double precio_total;
    
        public Venta(int numero_factura, String fecha, double precio_total) {
            this.numero_factura = numero_factura;
            this.fecha = fecha;
            this.precio_total = precio_total;
        }
    
        // Getters y setters
    
        public int getNumero_factura() {
            return numero_factura;
        }
    
        public void setNumero_factura(int numero_factura) {
            this.numero_factura = numero_factura;
        }
    
        public String getFecha() {
            return fecha;
        }
    
        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
    
        public double getPrecio_total() {
            return precio_total;
        }
    
        public void setPrecio_total(double precio_total) {
            this.precio_total = precio_total;
        }
}
