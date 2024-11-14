public class Cadena {
    public static void main(String[] args) {
        String cadena = "hola";
        System.out.println(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            //System.out.println(cadena.charAt(i));

            if (Character.isDigit(cadena.charAt(i))) {}


        }

        //minuscula
        cadena = cadena.toLowerCase();
        System.out.println(cadena);

        //mayuscula
        cadena = cadena.toUpperCase();
        System.out.println(cadena);

        //replace cambia una letra por otra
         cadena = cadena.replace('o', 'e');

        //trim recorta y le quita los espacios de delante y atras, no los de en medio
        cadena = cadena.trim();


    }
}
