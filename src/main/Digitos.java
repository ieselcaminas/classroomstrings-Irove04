public class Digitos {
    public static int cuantosSonDigitos(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isDigit(c)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {

        System.out.println(cuantosSonDigitos("123 casa"));
    }
}