public class Invertida {

    public static String invertir(String cadena){
        String res = "";
        String[] palabra = cadena.split(" ");


        for (int i = palabra.length -1; i >= 0; i--) {
            res = res + palabra[i] + " ";
        }
       return res;
    }

    public static void main(String[] args) {
    String cadena = " Esto es una frase";

        System.out.println(invertir(cadena));


    }
}
