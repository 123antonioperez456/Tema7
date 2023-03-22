
import java.util.Arrays;

public class Lista {

    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }

    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;

    }
    void insertarFinal(Lista otralista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla,tabla.length + otralista.tabla.length);
        System.arraycopy(otralista.tabla,0,tabla, tamIni,otralista.tabla.length);

    }
 void insertar(int posicion, Integer nuevo) {
    

}