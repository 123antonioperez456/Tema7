import java.time.LocalDateTime;
import java.time.LocalDate;

public class Texto {
    private String cad;
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAXIMO;
    static final String VOCALES = "aeiouäëïöü";

}

    /**
     * @param longitudMax
     */
    public Texto(int longitudMax) {
        cad = "";
        this.LONGITUD_MAXIMO = longitudMax;
        creacion = LocalDate.now();
        ultimaModificacion = null;
    }

    public void addFinal(char c) {
        if (LONGITUD_MAXIMO > cad.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(char c) {
        if (LONGITUD_MAXIMO > cad.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(String c) {
        if (LONGITUD_MAXIMO > cad.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

public void addFinal(String C) {
    if (LONGITUD_MAXIMO > cad.length()+ c.length()) {
        cad = cad + C;
        ultimaModificacion = LocalDateTime.now();
    
    }
}

    public void mostrar() {
 System.out.println("Texto creado el " + creacion);
 System.out.println("Ultioma modificacion: " + ultimaModificacion);
 System.out.println(cad);

        
    }
    public int numVocales() {
        int vocal = 0 ;
        for (int i = 0; i < cad.length(); i++) { 
            if (esVocal(cad.charAt(i))) {
                vocal++;

            }
    
    }
return(vocal);
    }
    private boolean esVocal(char c) {
        boolean vocal = false;
        c= Character.toLowerCase(c) 
            if (VOCALES.indexOf(c)) != -1) {
                vocal = true;
            }
return (vocal);
        }
