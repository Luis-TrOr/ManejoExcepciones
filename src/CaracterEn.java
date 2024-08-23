public class CaracterEn {

    public static char caracterEn(String cadena, int posicion) throws Exception {

        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            // Excepción si la posicion es invalida
            throw new Exception("Posicion no valida: " + posicion + ". La longitud de la cadena es: " + cadena.length());
        }
    }
}
