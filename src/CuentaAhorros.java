public class CuentaAhorros extends Cuenta{

    private static final double SALDO_MINIMO = 100;

    public CuentaAhorros(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {

        if (saldo < SALDO_MINIMO) {
            System.out.println("No es posible realizar el retiro .");
            System.out.println("Tu cuenta debe mantener al menos $100.");
        }
        else if ((saldo - monto) < SALDO_MINIMO) {
            System.out.println("No puedes retirar esa cantidad.");
            System.out.println("La cuenta no puede quedar con menos de $100.");
        }
        else {
            saldo -= monto;
            System.out.println("Retiro exitoso . Nuevo saldo: $" + saldo);
        }
    }
}
