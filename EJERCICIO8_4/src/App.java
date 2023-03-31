public class App {
    public static void main(String[] args) {
        Nota Cancion[] = { Nota.DO, Nota.RE, Nota.MI, Nota.SOL, Nota.LA, Nota.SI };
        Piano p = new Piano();
        for (Nota nota : Cancion) {
            p.add(nota);
        }

        p.interpretar();

    }

}