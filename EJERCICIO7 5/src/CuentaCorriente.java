
public class CuentaCorriente {
 String dni;
    String nombre;
    double saldo;
    static String nombreBanco;
    
        public CuentaCorriente(String string, String string2) {
        this.dni = dni;
        this.nombre=nombre;
        saldo = 0;
        }
    
        boolean egreso(double cant) { 
            boolean operacionPosible;
            if(saldo >= cant){
                saldo-=cant;
                operacionPosible = true;
            }else{
                System.out.println("No hay dinero suficiente");
                operacionPosible = false;
                return (operacionPosible);
    
            }
            return operacionPosible;
        }
    
        void ingreso (double cant) {
            saldo+=cant;
        }
    
        void mostrarInformacion(){
            System.out.println("DNI: "+dni);
            System.out.println("Nombre: "+nombre);
            System.out.println("Saldo: "+saldo+ "euros");
    
        }
    
    /*     public void ingreso(int i) {
        
        }
    
        public void egreso(int i) {
        }
    */

    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }
    
    static String getBanco() {
        return nombreBanco;
    }
}
    