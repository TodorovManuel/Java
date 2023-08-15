package sensores;

import java.util.ArrayList;

public class Detector {
    private Boolean conectado;
    private Double medida;
    private Double valorUmbral;
    private Integer anio;
    private ArrayList<DetectorHumo>detectoresHumo;
    private ArrayList<SensorTemperatura>sensoresTemperatura;
    private ArrayList<SensorPresion>sensoresPresion;

    public Detector(Boolean conectado, Double medida, Double valorUmbral, Integer anio, ArrayList<DetectorHumo> detectoresHumo, ArrayList<SensorTemperatura> sensoresTemperatura, ArrayList<SensorPresion> sensoresPresion) {
        this.conectado = conectado;
        this.medida = medida;
        this.valorUmbral = valorUmbral;
        this.anio = anio;
        this.detectoresHumo = detectoresHumo;
        this.sensoresTemperatura = sensoresTemperatura;
        this.sensoresPresion = sensoresPresion;
        detectoresHumo.add(new DetectorHumo(true, 0.0, 8.0, 2024));
        sensoresTemperatura.add(new SensorTemperatura(true, 0.0, 45.5, 2025));
        sensoresPresion.add(new SensorPresion(true, 0.0, 30.2, 2025));
    }

    public Detector(Boolean conectado, Double medida, Double valorUmbral, Integer anio) {
    }

    public ArrayList<DetectorHumo> getDetectoresHumo() {
        return detectoresHumo;
    }

    public void setDetectoresHumo(ArrayList<DetectorHumo> detectoresHumo) {
        this.detectoresHumo = detectoresHumo;
    }

    public ArrayList<SensorTemperatura> getSensoresTemperatura() {
        return sensoresTemperatura;
    }

    public void setSensoresTemperatura(ArrayList<SensorTemperatura> sensoresTemperatura) {
        this.sensoresTemperatura = sensoresTemperatura;
    }

    public ArrayList<SensorPresion> getSensoresPresion() {
        return sensoresPresion;
    }

    public void setSensoresPresion(ArrayList<SensorPresion> sensoresPresion) {
        this.sensoresPresion = sensoresPresion;
    }

    public Boolean getConectado() {
        return conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    public Double getMedida() {
        return medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public Double getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(Double valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void alarma() {
        System.out.println("alarmaaaaaa");
    }

    public void disparaHumo() {
        if (medida>getValorUmbral()){
            alarma();
            }
        }


    //  MISMA FUNCIÓN CON TEMPERATURA Y HUMO

}
