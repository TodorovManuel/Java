package banco;

import banco.Cliente;

import java.util.Scanner;

public class Cuenta {
 private Cliente titular;
 private long CBU;
 private long numeroCuenta;
 private String alias;
 private Double saldo;

    public Cuenta() {
        this.titular = new Cliente();
        this.CBU = 13241513213l;
        this.numeroCuenta = 324543634634l;
        this.alias = "martin.todorov.bd";
        this.saldo = 5000.00;
    }

    public Cuenta(Cliente titular, long CBU, long numeroCuenta, String alias, Double saldo) {
        this.titular = titular;
        this.CBU = CBU;
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public long getCBU() {
        return CBU;
    }

    public void setCBU(long CBU) {
        this.CBU = CBU;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "banco.Cuenta{" +
                "titular=" + titular +
                ", CBU=" + CBU +
                ", numeroCuenta=" + numeroCuenta +
                ", alias='" + alias + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public void Menu(){
        boolean salir = false;
        while(salir == false) {
            System.out.println("ingrese la opcion que quiere realizar");
            System.out.println("1. Depositar 2.Retirar 3.Salir");
            Scanner entrada = new Scanner(System.in);
            switch (entrada.nextInt()){
                case 1:
                    Depositar(saldo);
                    break;
                case 2:
                    Retirar(saldo);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("ingrese un valor valido");
                    break;

            }
        }
    }
    //methods
    public void Retirar(Double saldo){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cuanto dinero quiere retirar");
        double ingresado = entrada.nextDouble();
        saldo -= ingresado;
        System.out.println("el saldo que te quedo es");
        System.out.println(saldo);
    }
    public void Depositar(Double saldo){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese cuanto dinero quiere depositar");
        double ingresado = entrada.nextDouble();
        saldo += ingresado;
        System.out.println("el saldo que te quedo es");
        System.out.println(saldo);
    }

}
