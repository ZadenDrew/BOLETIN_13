package conversor_grados;

/**
 *
 * @author acabezaslopez
 */
public class Conversor_grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas convt = new ConversorTemperaturas();

        try {
            convt.centigradosAFharenheit();

        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println(ex.getMessage());

        }

        ConversorTemperaturas convt2 = new ConversorTemperaturas();

        convt2.centígradosAReamur();

    }

}
