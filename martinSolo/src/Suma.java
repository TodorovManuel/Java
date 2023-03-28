import java.util.ArrayList;

public class Suma {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        int suma=0;
        for (Integer jose: numeros) {
            suma = suma + jose;
        }
    }

}