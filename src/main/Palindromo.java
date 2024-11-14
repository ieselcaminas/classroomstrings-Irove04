public class Palindromo {
    public static void main(String[] args) {
        System.out.println(esPalindromo("ROJO"));
    }

    public static boolean esPalindromo(String cadena) {

        for (int i = 0; i < cadena.length() / 2; i++) {
            char letra = cadena.charAt(i);
            char letraFinal = cadena.charAt(cadena.length() - i - 1);
            if (letra != letraFinal) {
                return false;
            }
            return true;
        }
        return esPalindromo(cadena);
    }
}
