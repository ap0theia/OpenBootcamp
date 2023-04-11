import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Primera parte del ejercicio, IF
        primeraParte(0);

        //Segunda parte del ejercicio, While
        segundaParte(0);

        //Tercera parte, Do While
        terceraParte(2);

        //Cuarta parte, For
        cuartaParte();

        //Quinta parte, Switch
        quintaParte("PRIMAVERA");

    }

    public static void primeraParte(int numeroIf){
        System.out.println("Primera parte, if:");
        if (numeroIf == 0){
            System.out.println("La variable es "+numeroIf);
        } else if (numeroIf > 0) {
            System.out.println("La variable es positiva: "+numeroIf);
        }else{
            System.out.println("La variable es negativa: "+numeroIf);
        }
    }

    public static void segundaParte(int numeroWhile){
        System.out.println("Segunda parte, while:");
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void terceraParte(int numeroDowhile){
        System.out.println("Tercera parte, do while:");
        do{
            System.out.println("Variable introducida: "+numeroDowhile);
            numeroDowhile++;
            System.out.println("Incrementamos una vez y ya no se ejecuta por que cumple la condición: mientras variable < 3 incrementa");
        }while(numeroDowhile < 3);

    }

    public static void cuartaParte(){
        System.out.println("Cuarta parte, FOR:");
        for(int numeroFor=0 ; numeroFor <= 3 ; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void quintaParte(String estacion){
        System.out.println("Quinta parte, Switch:");
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("El valor introducido no es una estación");
        }

    }

}