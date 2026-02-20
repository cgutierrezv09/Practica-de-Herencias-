public class EmpleadoRH extends  Empleado {

    public  EmpleadoRH(String nombre, String apellidos, String puesto){

        super(nombre,apellidos,puesto);
    }

    public void contratarEmpleado(String nuevoNombre,String nuevoApellido, String nuevoPuesto){

        System.out.println("Se ha contratado un nuevo empleado llamado " + nuevoNombre + " "  + nuevoApellido +
                " en el puesto " + nuevoPuesto + ".");
    }

}
