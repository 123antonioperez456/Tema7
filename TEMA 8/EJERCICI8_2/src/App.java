import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        HoraExacta r = new HoraExacta (11, 15, 23);
        System.out.println();
        for (int i = 1; i <= 61; i++) {
            r.inc();
            

    } 
    System.out.println(r);
    System.out.println("Escribe los segunds Z");
    int segundos = new Scanner((System.in)).nextInt();
    if (r. setSegundos(segundos)) { 
    System.out.println(r);
    } else {
        System.out.println("No es posiblecambiar los segundos");
    }

}
}
