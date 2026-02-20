public class  Gato extends  Animal{

    //artributos

    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public  void hacerSonido(){
        super.hacerSonido();
        System.out.println(nombre+ "dice MIAU!");
    }
}
