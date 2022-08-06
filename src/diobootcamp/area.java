package diobootcamp;

public class area {
    public static void area(double a){
        double resultado = a*a;
        System.out.println("A área do quadrado de lado: "+ a +"é: " + resultado);

    }
    public static void area(double b, double h){
        double resultado = b*h;
        System.out.println("O resultado da área do triângulo é:" + resultado);
    }
    public static void area(double b, double B, double h){
        double resultado = ((b+B)*h)/2;
        System.out.println("O resultado da área do trapézio é: "+ resultado);

    }

    public static void area(float d1, float d2){
        float resultado = ((d1+d2)/2);
        System.out.println( "A área do losango:" + resultado);
    }

}
