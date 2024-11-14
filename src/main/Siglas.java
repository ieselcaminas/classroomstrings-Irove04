public class Siglas {
     public static String siglas(String[] palabra){
         String siglas = "";
         char c;

         for (int i = 0; i < palabra.length; i++) {
             //Cogemos el primer caracter
             c = palabra[i].charAt(0);
             //si es mayuscula
             if (Character.isUpperCase(c)) {
                 //se añade
                 siglas += c;
             }
         }
         return siglas;
     }


    public static void main(String[] args) {
        String cadena = "Escuela Oficial de Idiomas";
        String[] palabras = cadena.split(" ");

        System.out.println(siglas(palabras));

    }
}
