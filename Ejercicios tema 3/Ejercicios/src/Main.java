public class Main {
    public static void main(String[] args) {
        //Primera parte
        //También se podría hacer que la función retornara un int y mostrarlo a través de una variable poniendo el sout
        //fuera de la función
        suma(24,66);

        //Segunda parte

        //Declaramos un objeto desde la clase coche y lo llamamos miCoche()
        coche miCoche = new coche();

        //Mostramos primero la variable llamandola a través del objeto miCoche()
        System.out.println("Numero de puertas antes de aplicar la función incrementoPuertas(): "+miCoche.puertas);

        //Llamamos a la función incrementoPuertas() desde el objeto miCoche() y mostramos de nuevo la variable
        miCoche.incrementoPuertas();
        System.out.println("Numero de puertas después de aplicar la función incrementoPuertas(): "+miCoche.puertas);

    }

    public static void suma(int a, int b){
        System.out.println("Primera parte del ejercicio, función para sumar a+b: "+(a+b));
    }
}

//Clase coche
class coche{
    //Variable que almacena el numero de puertas del coche
    int puertas = 5;

    //Función que incrementa el numero de puertas
    public void incrementoPuertas(){
        this.puertas++;
    }
}