package Inicio;

public class Persona {

    private double identificacion;
    private String nombre;
    private String apellido;
    private double edad;
    private String direccion;
    private String telefono;

    public boolean setApellidos(String x) {
        if (x.equals("") == true) {
            System.out.println("error");
            System.exit(0);
        } else {
            this.apellido = x;
        }
        return true;
    }

    public boolean setDireccion(String x) {
        if (x.equals("") == true) {
            System.out.println("error");
            System.exit(0);

        } else {
            this.direccion = x;
        }
        return true;
    }

    public boolean setEdad(int y) {
        if (y < 0) {
            System.out.println("error");
            System.exit(0);
        } else {
            this.edad = y;
        }
        return true;
    }

    public boolean setIdentificacion(double x) {
        if (x < 0) {
            System.out.println("error");
            System.exit(0);
        } else {
            this.identificacion = x;
        }
        return true;
    }

    public boolean setNombres(String x) {
        if (x.equals("") == true) {
            System.out.println("error");
            System.exit(0);
        } else {
            this.nombre = x;
        }
        return true;
    }

    public boolean setTelefono(String x) {
        if (x.equals("") == true) {
            System.out.println("error");
            System.exit(0);
        } else {
            this.telefono = x;
        }
        return true;
    }

    public String getApellidos() {
        return apellido;
    }

    public String geDireccion() {
        return direccion;
    }

    public double getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getIdentificacion() {
        return identificacion;
    }

    public void imprimirDatos() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("edad: " + edad);
        System.out.println("direccion: " + direccion);
        System.out.println("identificacion: " + identificacion);
        System.out.println("telefono: " + telefono);

    }
}
