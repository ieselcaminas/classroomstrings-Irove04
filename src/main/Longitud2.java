public class Longitud2 {
    public static boolean longitud(String cadena, int num){
        String[] palabra = cadena.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() == num){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        String cadena = "cama casa clase alumnos";
        System.out.println(longitud(cadena, 4));
        }
    }


