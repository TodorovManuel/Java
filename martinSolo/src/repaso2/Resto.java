package repaso2;

import java.util.HashSet;

public class Resto implements Incorporacion{
    private String nombreResto;
    private HashSet<Chef>listaChefs;
    private HashSet<Plato>listaPlatos;

    public Resto(String nombreResto, HashSet<Chef> listaChefs, HashSet<Plato> listaPlatos) {
        this.nombreResto = nombreResto;
        this.listaChefs = listaChefs;
        this.listaPlatos = listaPlatos;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public HashSet<Chef> getListaChefs() {
        return listaChefs;
    }

    public void setListaChefs(HashSet<Chef> listaChefs) {
        this.listaChefs = listaChefs;
    }

    public HashSet<Plato> getListaPlatos() {
        return listaPlatos;
    }

    public void setListaPlatos(HashSet<Plato> listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

   @Override
    public void incorporar(Chef chef) {
       if (chef.getExperienciaPrevia() && chef.getEdad() > 18) {
        listaChefs.add(chef);
       } else{
           System.out.println("no cumple con las condiciones necesarias");
       }

   }
}


