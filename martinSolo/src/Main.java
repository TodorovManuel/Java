import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ArrayList<Llamada>llamadas = new ArrayList<>();
    llamadas.add(new Llamada(new EmpleadoTelefono(
            "Pepe", "Martinez", 23435334, "Argentina", 1123327736),
            new EmpleadoTelefono("Jose", "Pandoni", 22321190, "Brasil", 234333875),
            "8:32", "12-5-2023"));

        llamadas.add(new Llamada(new EmpleadoTelefono(
                "Jose", "Luis", 23415224, "Argentina", 1167282870),
                new EmpleadoTelefono("Martin", "Bensai", 21229084, "Brasil", 234420534),
                "2:20", "14-4-2023"));

        llamadas.add(new Llamada(new EmpleadoTelefono(
                "Ernesto", "Bandini", 259920438, "Australia", 1176435268),
                new EmpleadoTelefono("Ulises", "Jeperpein", 30423357, "Afganistan", 1142490873),
                "15:32", "30-9-2023"));

        llamadas.add(new Llamada(new EmpleadoTelefono(
                "Gustavo", "Freud", 23435334, "Estados Unidos", 90908743),
                new EmpleadoTelefono("Faustino", "Sarmiento", 198224296, "Argentina", 782319924),
                "8:32", "12-5-2023"));
    }
}