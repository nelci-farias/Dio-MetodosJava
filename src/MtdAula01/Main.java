package dio;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio Calculadora:");
        dio.Calculadora.somar(3,6);
        dio.Calculadora.subtrair(9,3);
        dio.Calculadora.multiplicar(30,8);
        dio.Calculadora.dividir(805.30,6);

        System.out.println("Exercicio Mensagem:");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);

        System.out.println("Exercicio Emprestimo:");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }
}
