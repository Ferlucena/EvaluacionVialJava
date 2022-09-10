/** Esto es una subclase de la abstracta Vehiculos*/

public class Motos extends Vehiculos {
    //Atributos
    private int cantidadEspejos = 2;
    private int velocidadFinal;
    private int plusVelocidad;

    //Constructor

    public Motos(int cantidadEspejos, int velocidadFinal, int plusVelocidad, String matricula) {
        super.setMatricula(matricula);
        this.cantidadEspejos = cantidadEspejos;
        this.velocidadFinal = velocidadFinal;
        this.plusVelocidad = plusVelocidad;
    }

    //Getters

    public int getCantidadEspejos() {
        return cantidadEspejos;
    }

    public int getVelocidadFinal() {
        return velocidadFinal;
    }

    //Setters

    public void setCantidadEspejos(int cantidadEspejos) {
        this.cantidadEspejos = cantidadEspejos;
    }

    //Metodo es seguro
    public boolean esSeguro(){
        if(this.cantidadEspejos>=2 && this.velocidadFinal<160) //utilizo vel final para no enredarme con plus y factor velocidad como en autos
        {return true;
    } else {
        return false;
    }
    }
}
