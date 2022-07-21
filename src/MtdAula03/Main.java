package MtdAula03;

public class Main {
    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercicio retornos");

        double areaQuadrado = QuadrilateroRet.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRet.area(5,4);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRet.area(10,8,9);
        System.out.println("Area do trapezio: " + areaTrapezio);

    }
}
