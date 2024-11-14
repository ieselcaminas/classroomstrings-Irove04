public class Longitud2 {
    public static void main(String[] args) {
        String cadena = "cama casa clase alumnos";
        String[] palabra = cadena.split(" ");
        int num = 4;
        boolean existe = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() == num){
                existe = true;
                break;
            }

        }
        if (existe){
            System.out.println("Hay alguna palabra con: " + num + " caracteres.");
        }


    }
}

