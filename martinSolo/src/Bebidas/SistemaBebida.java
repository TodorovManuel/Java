package Bebidas;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaBebida {
    private HashSet<Bebedor> bebedores;
    private HashMap<Bebida, Integer> bebidas;

    public SistemaBebida(HashMap<Bebida, Integer> bebidas) {
        this.bebidas = bebidas;
    }

    public HashSet<Bebedor> getBebedores() {
        return bebedores;
    }

    public void setBebedores(HashSet<Bebedor> bebedores) {
        this.bebedores = bebedores;
    }

    public HashMap<Bebida, Integer> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashMap<Bebida, Integer> bebidas) {
        this.bebidas = bebidas;
    }
      
}
