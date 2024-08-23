public class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {
        super("Numero negativo no permitido");
    }

    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}
