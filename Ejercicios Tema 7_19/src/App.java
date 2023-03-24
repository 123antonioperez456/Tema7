import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Inroduceme un numero para añadir al array");
        int numEntrada = sc.nextInt();
        Pila p = new Pila(numeros, numEntrada);
      
        

    }
}
