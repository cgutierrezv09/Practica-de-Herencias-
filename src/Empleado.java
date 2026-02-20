public class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String puesto;
    protected static final int HORAS_TRABAJADAS_DIA=8;
    protected static final double PAGO_HORA=4.200;
    protected static final int DIAS_SEMANA = 5;
    protected static final int SEMANAS_MES = 4;

    public Empleado(String nombre,String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.puesto=puesto;
    }

    public void trabajar(){
        System.out.println("El empleado " +nombre+ " con el puesto: " +puesto+ " esta trabajando");
    }

    public double calcularSalario(){
        int salarioTotal=HORAS_TRABAJADAS_DIA*DIAS_SEMANA*SEMANAS_MES;
        return salarioTotal*PAGO_HORA;
    }

}
