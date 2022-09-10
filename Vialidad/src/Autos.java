/** Esto es una subclase de la abstracta Vehiculos*/

public class Autos extends Vehiculos {
    //Atributos
    private boolean ruedaAuxilio;
    private int velocidadFinal;
    private int plusVelocidad;

    //Constructor


    public Autos(boolean ruedaAuxilio, int velocidadFinal, int plusVelocidad, String matricula) {
        super.setMatricula (matricula); //extendemos la clase.
        this.ruedaAuxilio = ruedaAuxilio;
        this.velocidadFinal = velocidadFinal;
        this.plusVelocidad = plusVelocidad;
    }

    //Getters

    public boolean isRuedaAuxilio() {
        return ruedaAuxilio;
    }

    public int getPlusVelocidad() {
        return plusVelocidad;
    }

    //Setters no se plantean

    public boolean esSeguro(){
        if(this.ruedaAuxilio == true && this.plusVelocidad+this.velocidadFinal < 120) {
            return true;
        }else {
            return false;
        }
    }


}
