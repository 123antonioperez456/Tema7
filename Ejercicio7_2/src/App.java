public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       CuentaCorriente c;
       c = new CuentaCorriente("12345678A", "Pepe");
       c.ingreso(1000);
       c. egreso(300);
       c.mostrarInformacion();
       System.out.println("Puedo sacar 700 €: "+ c.egreso(700));
       System.out.println( "Puedo sacar 1000 ���: "+ c.egreso(500));
     //  c= new CuentaCorriente (string: )
    }
}
