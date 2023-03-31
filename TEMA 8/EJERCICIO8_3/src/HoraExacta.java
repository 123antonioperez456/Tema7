public class HoraExacta extends Hora {
    /**
     *
     */
    protected int segundos;

    public HoraExacta(int Hora, int minutos, int segundos) {

        super(Hora, minutos);
        this.segundos = segundos;
        if (!setSegundos(segundos)) {
            System.out.println("Segundos incorrectos");

        }
    }

    /**
     * @param segundos
     * @return
     */
    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (0 <= segundos && segundos <= 60) {
            this.segundos = segundos;
            correcto = true;
        }
        return correcto;
    }

    @Override
    public void inc() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            super.inc();
        }

    }

    @Override
    public String toString() {
        String result = super.toString();
        result += ":" + segundos;
        return result;
    }

    public class HoraExacta extends Hora {
        public boolean equuals (object o ) {
            HoraExacta otroReloj = (HoraExacta) o;
            boolean iguales ;
            if (this.hora == otroReloj.Hora
            && this.minutos == otroReloj.minutos
            && this.segundos == otroReloj.segundos) {
                iguales = true;
            } else {
                iguales = false;
            }
            return iguales;

        }
        @Override
        public void inc() {
    }
}



    
}