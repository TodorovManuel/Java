//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package unidad0;

public class Ejercicio5 {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘Colchitas’ por internet";
        int vocales = 0;

        for(int i = 0; i < frase.length(); ++i) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A' || frase.charAt(i) == 'e' || frase.charAt(i) == 'E' || frase.charAt(i) == 233 || frase.charAt(i) == 'i' || frase.charAt(i) == 'I' || frase.charAt(i) == 'o' || frase.charAt(i) == 'O' || frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
                vocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + vocales);
    }
}
