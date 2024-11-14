public class Alfabetica {
    public static boolean esAlfabetica(String palabra){
        for (int i = 0; i < palabra.length() -1; i++) {
            //si la letra es mayor que la siguiente es que esta mal
            if (palabra.charAt(i) > palabra.charAt(i+1)) {
                return false;
            }
        }
        //si llega aqui esta bien
        return true;
    }


    public static void main(String[] args) {
        String cadena = "amor chino himno";
        String[] palabra = cadena.split(" ");

        System.out.println(palabra.length);
    }
}
