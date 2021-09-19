

package Inicio;


public class Inicio {
    public static void main(String[] args) {
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona p3=new Persona();
        p1.setApellidos("Romero");
        p1.setEdad(20);
        p1.setDireccion("calle 12 este");
        p1.setIdentificacion(11245543);
        p1.setNombres("Andres");
        p1.setTelefono("666");
        
        p2.setApellidos("Leal");
        p2.setEdad(32);
        p2.setDireccion("cale 60 norte");
        p2.setIdentificacion(121244875);
        p2.setNombres("Camilo");
        p2.setTelefono("666124");
        
        p3.setApellidos("Velasquez");
        p3.setEdad(19);
        p3.setDireccion("calle 12 sur");
        p3.setIdentificacion(1221321);
        p3.setNombres("liliana");
        p3.setTelefono("32141646");
        
        p1.imprimirDatos();
        System.out.println();
        p2.imprimirDatos();
        System.out.println();
        p3.imprimirDatos();
       
        System.out.println();
        System.out.println();
        Nomina n1=new Nomina();
        Nomina n2=new Nomina();
        Nomina n3=new Nomina();
        
        n1.setEmpleado(p1);
        boolean b1=n1.setSueldo(665000);
        boolean b2=n1.setValorHora(230);
        boolean b3=n1.setHorasTrabajadas(16125);
        boolean b4=n1.setDescuentos(2);
        n1.calcularNomina();
        n1.imprimirNomina();
        
        
        if ((b1||b2||b3||b4)==false)
            System.out.println("ingreso un valor erroneo.");
        else 
            System.out.println("los valores ingresados son validos");
        
        System.out.println();
        
        
        n2.setEmpleado(p2);
        boolean b5=n2.setSueldo(645000);
        boolean b6=n2.setValorHora(160);
        boolean b7=n2.setHorasTrabajadas(16125);
        boolean b8=n2.setDescuentos(2);
        n2.calcularNomina();
        n2.imprimirNomina();
        
        if ((b5||b6||b7||b8)==false)
            System.out.println("ingreso un valor erroneo.");
        else 
            System.out.println("los valores ingresados son validos");
        
        System.out.println();
        
        
        n3.setEmpleado(p3);
        boolean b9=n3.setSueldo(645000);
        boolean b10=n3.setValorHora(160);
        boolean b11=n3.setHorasTrabajadas(16125);
        boolean b12=n3.setDescuentos(2);
        n3.calcularNomina();
        n3.imprimirNomina();
        
        if ((b9||b10||b11||b12)==false)
            System.out.println("ingreso un valor erroneo.");
        else 
            System.out.println("los valores ingresados son validos");
    }
}
