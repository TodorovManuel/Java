package ej3excepciones;

import java.util.HashSet;

public class Main {
    PalomaMensajera josefa = new PalomaMensajera("josefa", false);
    PalomaMensajera estefania = new PalomaMensajera("estefania", true);
    TelefonoMovil sansun = new TelefonoMovil(1, "Samsung", "S23 Ultra", Compania.CLARO, 12343421);
    TelefonoMovil aifon = new TelefonoMovil(2, "Iphone", "Iphone 15", Compania.TUENTI, 123222414);
    Trabajador martin = new Trabajador("martin", 1231, 9, "Triunvirato 2231");
    Trabajador roger = new Trabajador("roger", 1311, 18, "Nazca 2314");
    Partido partido = new Partido("Bandoleros", "Julian alvarez 1818", 8, new HashSet<>());

}
