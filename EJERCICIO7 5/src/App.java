import java.util.zip.CRC32;

public class App {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c1, c2, c3;
        Gestor g1 = new Gestor("Antonio Gonzalez", "66655554444");
        Gestor g2 = new Gestor ("Bea rodriguez", "9876543210", 12000.0); 

        c1 = new CuentaCorriente("12345678A", "Pepe");
        c2 = new CuentaCorriente("87654321A", "Manolo");
        c3 = new CuentaCorriente("987654321A","sancho");
        c2.ingreso(2000);
        c1. egreso(300);
        c1.mostrarInformacion();
        System.out.println("Puedo sacar 700 €: "+ c1.egreso(700));
        System.out.println( "Puedo sacar 1000 ���: "+ c1.egreso(500));
        System.out.println("Prueba de Juanmi");
      //  c= new CuentaCorriente (string: )
    }
}
