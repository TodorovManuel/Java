import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private Integer cantRuedas;
    private String anioFabricacion;
    private Boolean descapotable;


    public Boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(Boolean descapotable) {
        this.descapotable = descapotable;
    }

    public Vehiculo(Boolean descapotable) {
        this.descapotable = descapotable;
    }

    public Vehiculo(String marca, String modelo, String color, Integer cantRuedas, String anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.anioFabricacion = anioFabricacion;
        this.descapotable = descapotable;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(Integer cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
