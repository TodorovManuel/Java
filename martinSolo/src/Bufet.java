import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

public class Bufet {
    private ArrayList<Pedido>listaPedidos;
    private ArrayList<Persona>listaPersonas;
    private ArrayList<Plato>listaPlatos;

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public void agregarAlumno() {
        Scanner lecturaAlumno = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String nombreAlumnoIngresado = lecturaAlumno.next();
        System.out.println("Ingrese el apellido del alumno: ");
        String apellidoAlumnoIngresado = lecturaAlumno.next();
        System.out.println("Ingrese la division del alumno: ");
        String divisionAlumnoIngresado = lecturaAlumno.next();
        listaPersonas.add(new Alumno(nombreAlumnoIngresado, apellidoAlumnoIngresado, divisionAlumnoIngresado));
    }

    public void agregarProfesor() {
        Scanner lecturaProfesor = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor: ");
        String nombreProfesorIngresado = lecturaProfesor.next();
        System.out.println("Ingrese el apellido del profesor: ");
        String apellidoProfesorIngresado = lecturaProfesor.next();
        System.out.println("Ingrese el descuento del profesor: ");
        Double descuentoProfesorIngresado = lecturaProfesor.nextDouble();
        listaPersonas.add(new Profesor(nombreProfesorIngresado, apellidoProfesorIngresado, descuentoProfesorIngresado));
    }

    public void agregarPlato() {
        Scanner lecturaPlato = new Scanner(System.in);
        System.out.println("Ingrese el nombre del plato: ");
        String nombrePlatoIngresado = lecturaPlato.next();
        System.out.println("Ingrese el precio del plato: ");
        Double precioPlatoIngresado = lecturaPlato.nextDouble();
        listaPlatos.add(new Plato(nombrePlatoIngresado, precioPlatoIngresado));
    }

    public void agregarPedido() {
        Scanner lecturaPedido = new Scanner(System.in);
        System.out.println("Ingrese la fecha de creacion: ");
        String fechaCreacionIngresada = lecturaPedido.next();
        System.out.println("Ingrese el horario de entrega: ");
        String horarioEntregaIngresado = lecturaPedido.next();
        System.out.println("Ingrese 'true', en caso de que el pedido haya sido entregado o 'false' ");
        Boolean entregadoIngresado = lecturaPedido.hasNextBoolean();
        listaPedidos.add(new Pedido(fechaCreacionIngresada, horarioEntregaIngresado, entregadoIngresado));
    }

    public void modificarAlumno() {
        Scanner lecturaQueAlumno = new Scanner((System.in));
        System.out.println("Que alumno quiere modificar?: ");
        String alumnoModificar = lecturaQueAlumno.next();
        for(Persona listaPersona: listaPersonas) {
            if(listaPersona instanceof Alumno && listaPersona.getNombre()==alumnoModificar) {
                System.out.println("Ingrese nuevo nombre: ");
                String nuevoNombreIngresado = lecturaQueAlumno.next();
                listaPersona.setNombre(nuevoNombreIngresado);
                System.out.println("Ingrese nuevo apellido: ");
                String nuevoApellidoIngresado = lecturaQueAlumno.next();
                listaPersona.setApellido(nuevoApellidoIngresado);
                System.out.println("El alumno fue modificado correctamente");
            }
        }
    }

    public void modificarProfesor() {
        Scanner lecturaQueProfesor = new Scanner((System.in));
        System.out.println("Que profesor quiere modificar?: ");
        String profesorModificar = lecturaQueProfesor.next();
        for(Persona listaPersona: listaPersonas) {
            if(listaPersona instanceof Profesor && listaPersona.getNombre()==profesorModificar) {
                System.out.println("Ingrese nuevo nombre: ");
                String nuevoNombreIngresado = lecturaQueProfesor.next();
                listaPersona.setNombre(nuevoNombreIngresado);
                System.out.println("Ingrese nuevo apellido: ");
                String nuevoApellidoIngresado = lecturaQueProfesor.next();
                listaPersona.setApellido(nuevoApellidoIngresado);
                System.out.println("El profesor fue modificado correctamente");
            }
        }
    }

    public void modificarPlato() {
        Scanner lecturaQuePlato = new Scanner((System.in));
        System.out.println("Que plato quiere modificar?: ");
        String platoModificar = lecturaQuePlato.next();
        for(Plato listaPlato: listaPlatos) {
            if(listaPlato.getNombrePlato()==platoModificar) {
                System.out.println("Ingrese nuevo nombre del plato: ");
                String nuevoNombreIngresado = lecturaQuePlato.next();
                listaPlato.setNombrePlato(nuevoNombreIngresado);
                System.out.println("Ingrese nuevo precio: ");
                double nuevoPrecioIngresado = lecturaQuePlato.nextDouble();
                listaPlato.setPrecioPlato(nuevoPrecioIngresado);
                System.out.println("El plato fue modificado correctamente");
            }
        }
    }

    public void modificarPedido() {
        Scanner lecturaQuePedido = new Scanner((System.in));
        System.out.println("Que pedido quiere modificar?: ");
        String pedidoModificar = lecturaQuePedido.next();
        for(Pedido listaPedido: listaPedidos) {
            if(listaPedido.getFechaCreacion()==pedidoModificar) {
                System.out.println("Ingrese el nuevo horario de entrega: ");
                String nuevoHorarioIngresado = lecturaQuePedido.next();
                listaPedido.setFechaCreacion(nuevoHorarioIngresado);
                System.out.println("Ingrese si esta entregado 'true' y si no 'false': ");
                boolean nuevoEntregadoIngresado = lecturaQuePedido.hasNext();
                listaPedido.setFechaCreacion(String.valueOf(nuevoEntregadoIngresado));
                System.out.println("El pedido fue modificado correctamente");
            }
        }
    }

    public void eliminarAlumno() {
        Scanner lecturaAlumnoEliminar = new Scanner((System.in));
        System.out.println("Que alumno quiere eliminar?: ");
        String alumnoEliminar = lecturaAlumnoEliminar.next();
        for(Persona listaPersona: listaPersonas) {
            if (listaPersona instanceof Alumno && listaPersona.getNombre()==alumnoEliminar) {
                listaPersonas.remove(listaPersona);
            }
        }
    }

    public void eliminarProfesor() {
        Scanner lecturaProfesorEliminar = new Scanner((System.in));
        System.out.println("Que profesor quiere eliminar?: ");
        String profesorEliminar = lecturaProfesorEliminar.next();
        for(Persona listaPersona: listaPersonas) {
            if (listaPersona instanceof Profesor && listaPersona.getNombre()==profesorEliminar) {
                listaPersonas.remove(listaPersona);
            }
        }
    }

    public void eliminarPedido() {
        Scanner lecturaPedidoEliminar = new Scanner((System.in));
        System.out.println("Que pedido quiere eliminar?: ");
        String pedidoEliminar = lecturaPedidoEliminar.next();
        for(Pedido listaPedido: listaPedidos) {
            if (listaPedido.getNombre()==pedidoEliminar) {
                listaPedidos.remove(listaPedido);
            }
        }
    }

    public void eliminarPlato() {
        Scanner lecturaPlatoEliminar = new Scanner((System.in));
        System.out.println("Que plato quiere eliminar?: ");
        String platoEliminar = lecturaPlatoEliminar.next();
        for(Plato listaPlato: listaPlatos) {
            if (listaPlato.getNombrePlato()==platoEliminar) {
                listaPersonas.remove(listaPlato);
            }
        }
    }

    public void menu() {
        Scanner lecturaMenu = new Scanner(System.in);
        System.out.println("Presione 1 para agregar un alumno, profesor, plato o pedido");
        System.out.println("Presione 2 para modificar la informacion de un alumno, profesor, plato o pedido");
        System.out.println("Presione 3 para eliminar a un alumno, profesor, plato o pedido");
        System.out.println("Presione cualquier otro caracter para salir del menu");
        Integer numeroIngresado = lecturaMenu.nextInt();
        switch (numeroIngresado) {
            case 1:
                agregar();
            case 2:
                modificar();
            case 3:
                eliminar();
            default:
                System.out.println("Ha salido del menu");
        }
    }

    public void agregar() {
        Scanner lecturaAgregar = new Scanner(System.in);
        System.out.println("Que queres agregar? alumno, profesor, plato o pedido: ");
        String queIngresa = lecturaAgregar.next();
        switch (queIngresa) {
            case "Alumno":
                agregarAlumno();
            case "alumno":
                agregarAlumno();
            case "Profesor":
                agregarProfesor();
            case "profesor":
                agregarAlumno();
            case "Pedido":
                agregarPedido();
            case "pedido":
                agregarPedido();
            case "Plato":
                agregarPlato();
            case "plato":
                agregarPlato();
            default:
                System.out.println("Que queres ingresar chabon/chabona??????!!!");
        }
    }

    public void modificar() {
        Scanner lecturaModificar = new Scanner(System.in);
        System.out.println("Que queres modificar? alumno, profesor, plato o pedido: ");
        String queIngresa = lecturaModificar.next();
        switch (queIngresa) {
            case "Alumno":
                modificarAlumno();
            case "alumno":
                modificarAlumno();
            case "Profesor":
                modificarProfesor();
            case "profesor":
                modificarAlumno();
            case "Pedido":
                modificarPedido();
            case "pedido":
                modificarPedido();
            case "Plato":
                modificarPlato();
            case "plato":
                modificarPlato();
            default:
                System.out.println("Que queres modificar chabon/chabona??????!!!");
        }
    }

    public void eliminar() {
        Scanner lecturaEliminar = new Scanner(System.in);
        System.out.println("Que queres modificar? alumno, profesor, plato o pedido: ");
        String queIngresa = lecturaEliminar.next();
        switch (queIngresa) {
            case "Alumno":
                eliminarAlumno();
            case "alumno":
                eliminarAlumno();
            case "Profesor":
                eliminarProfesor();
            case "profesor":
                eliminarAlumno();
            case "Pedido":
                eliminarPedido();
            case "pedido":
                eliminarPedido();
            case "Plato":
                eliminarPlato();
            case "plato":
                eliminarPlato();
            default:
                System.out.println("Que queres eliminar chabon/chabona??????!!!");
        }
    }

    public void listaMostrar() {
        for(Persona listaPersona : listaPersonas) {

            for (Pedido listaPedido : listaPedidos) {
                System.out.println( "Fecha de creacion: " + listaPedido.getFechaCreacion() + " Horario de entrega: " + listaPedido.getHorarioEntrega());
                for (Plato listaPlato : listaPlatos) {
                    if(listaPersona instanceof Profesor) {
                        double descuentoAplicar = ((Profesor) listaPersona).getDescuento();
                        System.out.println("Plato: " + listaPlato.getNombrePlato() + " Precio: " + (listaPlato.getPrecioPlato() - (descuentoAplicar*listaPlato.getPrecioPlato()/100)));
                    } else {
                        System.out.println("Plato: " + listaPlato.getNombrePlato() + " Precio: " + listaPlato.getPrecioPlato());
                    }

                }
            }
        }
    }
}
