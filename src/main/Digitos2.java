public class Digitos2 {
    public static void main(String[] args) {
        System.out.println(esNumero("casa 445 4"));
    }


    public static boolean esNumero(String cadena) {
        int contador = 0;
        String[] palabra = cadena.split(" ");
        boolean esNumero = true;

        for (int i = 0; i < palabra.length; i++) {
            esNumero = true;
            for (int j = 0; j < cadena.length(); j++) {
                if (!Character.isDigit(palabra[i].charAt(i))) {
                    esNumero = false;
                    break;
                }
            }
            if (esNumero) contador++;
        }
        return esNumero;
    }
}
