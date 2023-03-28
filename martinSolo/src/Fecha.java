public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 6;
        this.mes = 8;
        this.anio = 2005;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida(dia, mes, anio);
    }
    public int valida(int dia, int mes, int anio){
        if(dia < 1 || dia > 31) {
            dia=1;
        }

        if(mes < 1 || mes > 12) {
           mes=1;
        }

        if(anio < 1) {
           anio=1900;
        }
        System.out.println(dia + " " + mes + " " + anio);
        return dia;
    }

    public int diasMes(int mes) {
        int dias;
        if(mes==2) {
            dias = 28;
        } else if(mes%2 == 0) {
            dias=30;
        } else {
            dias=31;
        }
        return dias;
    }

    public void menorMayor(int dia, int mes, int anio) {
        if(this.anio>anio) {
            System.out.println("El libro de " + this.anio + this.mes + this.dia + " es mas nuevo");
        } else if(this.anio<anio) {
            System.out.println("El libro de " + this.anio + this.mes + this.dia + " es mas viejo");
        } else {
            if(this.mes>mes) {
                System.out.println("El libro de " + this.anio + this.mes + this.dia + " es mas nuevo");
            } else if(this.mes<mes) {
                System.out.println("El libro de " + this.anio + this.mes + this.dia + " es mas viejo");
            } else {
                if (this.dia > dia) {
                    System.out.println("El libro de " + this.anio + this.mes + this.dia + " es mas nuevo");
                } else if (this.dia < dia) {
                    System.out.println("El libro de " + this.anio + this.mes + this.dia + " es mas viejo");
                } else {
                    System.out.println("Los libros fueron publicados en la misma fecha");
                }
            }
        }
    }
}


