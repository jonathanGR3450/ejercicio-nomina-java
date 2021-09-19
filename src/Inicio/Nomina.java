package Inicio;

public class Nomina {

    private Persona empleado;
    private double sueldo;
    private double descuento;
    private double salud;
    private double pension;
    private double arl;
    private double sueldo_neto;
    private double horas_trabajadas;
    private double valor_hora;

    public Nomina(){
     sueldo=645000;
     horas_trabajadas=160;
     valor_hora=16125;
     }
     
    public void setEmpleado(Persona p) {
        this.empleado = p;

    }

    public Persona getEmpleado() {
        return empleado;
    }

    public boolean setSueldo(double valor) {
        if (valor < 0) {
            System.out.println("error");
            return false;
        } else {
            this.sueldo = valor;
            return true;
        }

    }

    public boolean setValorHora(double valor) {
        if (valor < 1) {
            System.out.println("error");
            return false;
        } else {
            this.valor_hora = valor;
            return true;
        }

    }

    public boolean setHorasTrabajadas(double valor) {
        if (valor < 0) {
            System.out.println("error");
            return false;
        } else {
            this.horas_trabajadas = valor;
            return true;
        }

    }

    public boolean setDescuentos(double valor) {
        if (valor < 0) {
            System.out.println("error");
            return false;
        } else {
            this.descuento = valor;
            return true;
        }

    }
    public double getSueldo(){
    return this.sueldo;
    }
    public double getValorHora(){
    return this.valor_hora;
    }
    public double getHoras_Trabajadas(){
    return this.horas_trabajadas;
    }
    public double getDescuentos(){
    return this.descuento;
    }

    private void calcularsalud() {
        this.salud = sueldo * 0.045;
        
    }

    private void calcularPension() {
        this.pension = sueldo * 0.045;
    }

    private void calcularArl() {
        this.arl = sueldo * 0.05;
    }

    public void calcularNomina() {
        calcularsalud();
        calcularPension();
        calcularArl();
        this.sueldo_neto = sueldo - (descuento + pension + salud + arl);
    }

    public void imprimirNomina() {
        System.out.println("datos del empleado: ");
        empleado.imprimirDatos();
        System.out.println("sueldo: " + sueldo);
        System.out.println("descuento: " + descuento);
        System.out.println("salud: " + salud);
        System.out.println("pension: " + pension);
        System.out.println("arl: " + arl);
        System.out.println("sueldo neto: " + sueldo_neto);
        System.out.println("horas trabajadas: " + horas_trabajadas);
        System.out.println("valor horas: " + valor_hora);
    }

}
