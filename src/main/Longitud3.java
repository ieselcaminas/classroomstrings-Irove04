public class Longitud3 {
    public static boolean largoCorto(String cadena, int num){
        String[] palabra = cadena.split(" ");

        boolean largo = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length() >= num){
                largo = true;
                break;
            }

        }
        return largo;

    }



    public static void main(String[] args) {
        String cadena = "cama casa clase alumnos";
        int num = 4;

        if (largoCorto(cadena, num)){
            System.out.println("Largo.");
        }else
            System.out.println("Corto.");

    }
}
