/**Método main
 * Punto de acceso, contruyo un auto de prueba y un conductor para observar el comportamiento
 * del programa y evaluar los resultados obtenidos
 * La evaluacion se presenta mediante una estructura de seleccion doble
 * */

public class Vialidad {
    public static void main(String[] args) {
        //Instanciacion de objetos
        Autos miAuto = new Autos(true, 100, 10,"abc123" );
        Conductores conductorJuan = new Conductores(true, 48789456, "Juan","Fulano");

        //Proceso
        if(conductorJuan.esSeguro()==true && miAuto.esSeguro()==true){
            System.out.println("El conductor " + conductorJuan.getNombre() + " " + conductorJuan.getApellido() + " ES SEGURO ");
        }else{
            System.out.println("El conductor " + conductorJuan.getNombre() + " " + conductorJuan.getApellido() + " NO ES SEGURO ");
        }
        }
    }

