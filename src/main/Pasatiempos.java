public class Pasatiempos {
    public static String crearPasatiempo(String cadena){

        for (int i = 0; i < cadena.length(); i++) {
            //minuscula
            cadena = cadena.replace('a', '.');
            cadena = cadena.replace('e', '.');
            cadena = cadena.replace('i', '.');
            cadena = cadena.replace('o', '.');
            cadena = cadena.replace('u', '.');

            //mayuscula
            cadena = cadena.replace('A', '.');
            cadena = cadena.replace('E', '.');
            cadena = cadena.replace('I', '.');
            cadena = cadena.replace('O', '.');
            cadena = cadena.replace('U', '.');

        }
        return cadena;
    }



    public static void main(String[] args) {
        String cadena = "n ejemplo de pasatiempos";

        System.out.println(crearPasatiempo(cadena));
        }
    }

