public class Cuenta {
    protected double saldo;


    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void deporsitar(double monto){
        saldo+=monto;
        System.out.println("Deposito realizado, nuevo saldo "+saldo);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }


}
