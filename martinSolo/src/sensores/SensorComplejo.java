package sensores;

import java.util.ArrayList;

public class SensorComplejo{

    private ArrayList<Detector> detectores;
    private Double umbral;
    public SensorComplejo(Boolean conectado, Double medida, Double valorUmbral, Integer anio, ArrayList<DetectorHumo> detectoresHumo, ArrayList<SensorTemperatura> sensoresTemperatura, ArrayList<SensorPresion> sensoresPresion) {
        super();
    }

    public ArrayList<Detector> getDetectores() {
        return detectores;
    }

    public void setDetectores(ArrayList<Detector> detectores) {
        this.detectores = detectores;
    }

    public Double getUmbral() {
        return umbral;
    }

    public void setUmbral(Double umbral) {
        this.umbral = umbral;
    }

    public SensorComplejo(Boolean conectado, Double medida, Double valorUmbral, Integer anio, ArrayList<DetectorHumo> detectoresHumo, ArrayList<SensorTemperatura> sensoresTemperatura, ArrayList<SensorPresion> sensoresPresion, ArrayList<Detector> detectores, Double umbral) {
        super();
        this.detectores = detectores;
        this.umbral = umbral;
    }

    public double calcularPromedio(ArrayList<Detector>detectores) {
        double promedio;
        double suma = 0;
        for (int i=0 ; detectores.size()>=i ; i++) {
        suma+=detectores.get(i).getMedida();
        }
        promedio = suma/detectores.size();
        return promedio;
    }
        public void activarSensor(Double promedio) {
            for (Detector listaHumo:detectores) {
                if(listaHumo.getConectado()==true) {
                    if(promedio > listaHumo.getValorUmbral()) {
                        alarma();
                    } else {
                        System.out.println("Falsa alarma jejeejjejejej xdxdxd");
                    }
                }
            }
        }

    public void alarma() {
        System.out.println("Los valores medidos superaron el valor umbral");
    }
}
