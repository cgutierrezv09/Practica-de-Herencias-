public class CuentaAhorros extends Cuenta{

    private static final double SALDO_MINIMO = 100;

    public CuentaAhorros(double saldo) {
        super(saldo);
    }
    public void deporsitar(double monto){
        saldo+=monto;
        System.out.println("Deposito realizado, nuevo saldo "+saldo);
    }

    public double retirar() {
        if (SALDO_MINIMO<100){
            System.out.println("Fondos insuficientes, este banco no " +
                    "permite retirar menos de 100 dolares");
        }else{
            System.out.println("Retiro extitoso este es su nuevo saldo "+saldo);
        }
        return saldo;
    }
}
