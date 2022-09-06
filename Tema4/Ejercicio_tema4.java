import java.util.Scanner;

public class Ejercicio_tema4{
    public static void main(String[] args) {
        primero();
        System.out.println("********Fin de primera parte************");
        segundo();
        System.out.println("********Fin de segunda parte************");
        tercero();
        System.out.println("********Fin de tercera parte************");
        cuarto();
        System.out.println("********Fin de cuarta parte************");
        quinto();
        System.out.println("********Fin************");
    }

    public static void primero(){
        double numeroIF=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un número");
        numeroIF=Double.parseDouble(lectura.nextLine());
        
        if(numeroIF>0){
            System.out.println("El número es positivo");
        }
        else if(numeroIF<0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es cero");
        }
    }
    public static void segundo(){
        int numeroWhile=0;

        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile= numeroWhile+1;
        }
    }
    public static void tercero(){
        int numeroDoWhile=0;

        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile= numeroDoWhile+3;
        }
        while(numeroDoWhile<3);
    }

    public static void cuarto(){
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
    }
    
    public static void quinto(){
        String estacion="";
        int op=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un número del uno al cuatro");
        op = Integer.parseInt(lectura.nextLine());

        switch (op) {
            case 1:
                estacion="verano";
                System.out.println("La estación es: "+ estacion);
                break;
            case 2:
                estacion="primavera";
                System.out.println("La estación es: "+ estacion);
                break;
            case 3:
                estacion="invierno";
                System.out.println("La estación es: "+ estacion);
                break;
            case 4:
                estacion="otoño";
                System.out.println("La estación es: "+ estacion);
                break;
            default:
                System.out.println("Digita un número valido");
                quinto();
                break;
        }
    }
}


