public class Conductores {
    //Declaracion de atributos
    private boolean registro;
    private int dni;
    private String nombre;
    private String apellido;

    //Constructor
    public Conductores(boolean registro, int dni, String nombre, String apellido) {
        this.registro = registro;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Setters
    public void setRegistro(boolean registro) {
        this.registro = registro;
    }

    public boolean esSeguro(){
        if (this.registro == true) {
            return true;
        } else {
            return false;
        }
    }

}
