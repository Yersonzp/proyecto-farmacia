package Farmacia;


public class Empleado {
    private String nombre;
    private int numero_empleados;
    private String cargo;
    private double salario;

    public Empleado(String nombre, int numero_empleados, String cargo, double salario) {
        this.nombre = nombre;
        this.numero_empleados = numero_empleados;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(int numero_empleados) {
        this.numero_empleados = numero_empleados;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}