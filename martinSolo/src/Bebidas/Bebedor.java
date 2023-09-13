package Bebidas;

import persona.Persona;
import tiempo.Fecha;

import java.util.HashMap;
import java.util.Map;

public class Bebedor extends Persona {
    private HashMap<Bebida, Integer> bebidasConsumidas;

    public int coeficienteDeHidratacion() {
        int suma = 0;
        for(Map.Entry<Bebida, Integer> bebida: bebidasConsumidas.entrySet()){
            suma+=
                    bebida.getValue()=
                    (bebida.getKey().getCoeficientePositividad()-
                            bebida.getKey().diferenciCoeficientes()}
        }

    }



}
