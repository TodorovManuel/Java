import java.util.ArrayList;

public class Letra {
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<String>();
        cadena.add("Pepe");
        cadena.add("Pepa");
        cadena.add("Todorov");
        cadena.add("Tincho");
        cadena.add("Tronce");
        cadena.add("troncelonex");

        for (String palabras: cadena){
            if(palabras.charAt(0) == 'T' || palabras.charAt(0) == 't'){
                System.out.println(palabras);
            }
        }

    }
}
