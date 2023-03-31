import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Hora r = new Hora(11, 30);
        System.out.println(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();

        }
        System.out.println(r);

        System.out.println("Escribe una hora");
        int hora = new Scanner(System.in).nextInt();
        boolean cambio = r.setHora(hora);
        System.out.println("Cambio");
        if (cambio) {
            System.out.println(r);
        } else {
            System.out.println("La Hora no se pudo cambioar");
        }
    }
}
