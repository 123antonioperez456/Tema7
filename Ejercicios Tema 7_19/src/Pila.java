import java.util.Arrays;

public class Pila {
    private Integer[] numeros;
    int numEntrada;

    public Pila( int numEntrada) {
        this.numEntrada = numEntrada;
    }

    public Pila() {
        numeros = new Integer[0];
    }

    /**
     * @param i
     */
    public void apilar(int i) {

    }

    public void mostrar() {
    }

    void insertarPrincipio(int nuevo) {
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        System.arraycopy(numeros, 0, numeros, 1, numeros.length - 1);
        nuevo = numeros[0];
    }

    void insertarFinal(int nuevo) {
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = nuevo;
    }
}
