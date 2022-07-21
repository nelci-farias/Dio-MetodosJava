package dio;

public class Calculadora {
    public static void somar (double numero1, double numero2){
        double resultado = numero1 + numero2;

        System.out.println("A soma de "+numero1+" e "+numero2+" eh = "+resultado);
    }
    public static void subtrair (double numero1, double numero2){
        double resultado = numero1 - numero2;

        System.out.println("A subtracao de "+numero1+" e "+numero2+" é = "+resultado);
    }
    public static void multiplicar (double numero1, double numero2){
        double resultado = numero1 * numero2;

        System.out.println("A multiplicacao de "+numero1+" por "+numero2+" é = "+resultado);
    }
    public static void dividir (double numero1, double numero2){
        double resultado = numero1 / numero2;

        System.out.println("A divisao de "+numero1+" por "+numero2+" eh = "+resultado);
    }

}
