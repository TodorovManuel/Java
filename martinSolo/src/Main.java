import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Equipo> equipoArrayList = new ArrayList<>();
        ArrayList<Jugador> jugadorArrayList=new ArrayList<>();
        equipoArrayList.add(new Equipo("Mañana", "Lunes","JoseS clubes","Urquiza", jugadorArrayList));
        jugadorArrayList.add(new Jugador("Jose", "2-5-2020", 3));
        jugadorArrayList.add(new Jugador("Joseluis", "2-6-2020", 4));
        jugadorArrayList.add(new Jugador("Jose", "2-6-2020", 5));
        jugadorArrayList.add(new Jugador("Jose", "8-4-2020", 6));
        jugadorArrayList.add(new Jugador("Jose", "10-1-2020", 7));
        jugadorArrayList.add(new Jugador("Jose", "2-5-2020", 8));
        jugadorArrayList.add(new Jugador("Jose", "30-8-2020", 9));
        jugadorArrayList.add(new Jugador("Jose", "2-5-2002", 11));
        jugadorArrayList.add(new Jugador("Jose", "9-5-2002", 40));
        jugadorArrayList.add(new Jugador("Jose", "10-10-2002", 22));

        equipoArrayList.add(new Equipo("Mañana", "Lunes","Pepes clubes","Pueyrredon", jugadorArrayList));
        jugadorArrayList.add(new Jugador("Pepe", "2-5-2006", 8));
        jugadorArrayList.add(new Jugador("Pepeluis", "2-6-2001", 7));
        jugadorArrayList.add(new Jugador("Pepe", "2-6-2005", 5));
        jugadorArrayList.add(new Jugador("Pepe", "8-4-2022", 6));
        jugadorArrayList.add(new Jugador("Pepe", "10-1-2019", 10));
        jugadorArrayList.add(new Jugador("Pepe", "2-5-2010", 8));
        jugadorArrayList.add(new Jugador("Pepe", "30-8-2010", 9));
        jugadorArrayList.add(new Jugador("Pepe", "2-5-2012", 11));
        jugadorArrayList.add(new Jugador("Pepe", "9-5-2012", 47));
        jugadorArrayList.add(new Jugador("Pepe", "10-10-2015", 27));

        equipoArrayList.add(new Equipo("Noche", "Martes","Alfonsos clubes","Flores", jugadorArrayList));
        jugadorArrayList.add(new Jugador("Alfonso", "2-5-2006", 8));
        jugadorArrayList.add(new Jugador("Alfonsoluis", "2-6-2001", 7));
        jugadorArrayList.add(new Jugador("Alfonso", "2-6-2005", 5));
        jugadorArrayList.add(new Jugador("Alfonso", "8-4-2022", 6));
        jugadorArrayList.add(new Jugador("Alfonso", "10-1-2019", 10));
        jugadorArrayList.add(new Jugador("Alfonso", "2-5-2010", 8));
        jugadorArrayList.add(new Jugador("Alfonso", "30-8-2010", 9));
        jugadorArrayList.add(new Jugador("Alfonso", "2-5-2012", 11));
        jugadorArrayList.add(new Jugador("Alfonso", "9-5-2012", 47));
        jugadorArrayList.add(new Jugador("Alfonso", "10-10-2015", 27));


    }
}