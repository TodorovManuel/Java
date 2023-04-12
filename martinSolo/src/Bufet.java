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
        
    }

    public void modificarProfesor() {

    }

    public void modificarPlato() {

    }

    public void modificarPedido() {

    }

    public void eliminarAlumno() {

    }

    public void eliminarProfesor() {

    }

    public void eliminarPedido() {

    }

    public void eliminarPlato() {

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
}
