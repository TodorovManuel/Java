import java.util.ArrayList;

public class Edad {
    public static void main(String[] args) {
        ArrayList<Persona> edades = new ArrayList<Persona>();
        Persona personita = new Persona("martin", 18, "cochrane 8888");
        Persona personita2=new Persona(9);
        Persona personita3 = new Persona("jorge",40);
        edades.add(personita);
        edades.add(personita2);
        edades.add(personita3);
        edades.add(personita);
        for (Persona persona : edades){
            if(persona.getEdad()>30)
                System.out.println(persona.getNombre());
        }
    }
}
