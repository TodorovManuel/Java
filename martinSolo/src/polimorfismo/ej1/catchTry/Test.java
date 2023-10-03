package polimorfismo.ej1.catchTry;

public class Test {

    public static void motivo(String nombre) throws NullPointerException {
        System.out.println(nombre.length());
    }

    public class NombreNullException extends Exception {
        public NombreNullException (String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        String nombre = null;
        try {
           // System.out.println("El largo del nombre es:"+ nombre.length());
            motivo(nombre);
        } catch (Exception e) { //NullPointerException para try catch
            //e.printStackTrace();
            //No sabemos para que es getMessage pero en breve se descubrira
            // e.getMessage();
            System.err.println(e);
        }

        if(nombre==null) {
            throw new NullPointerException("EL nombre es null");
        }
        System.out.println("El nombre mas largo es " + nombre.length());


    }
}


