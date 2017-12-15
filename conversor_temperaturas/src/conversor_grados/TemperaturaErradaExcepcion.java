package conversor_grados;

/**
 *
 * @author acabezaslopez
 */
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("Informacion de la excepcion");
    }

    public TemperaturaErradaExcepcion(String mensaje) {
        super(mensaje);

    }
}
