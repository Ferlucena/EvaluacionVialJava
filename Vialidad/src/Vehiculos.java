public abstract class Vehiculos {
    private int factorVelocidad;
    private String matricula;

     //Getters
    public int getFactorVelocidad() {
        return factorVelocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    //Setter
    public void setFactorVelocidad(int factorVelocidad) {
        this.factorVelocidad = factorVelocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
