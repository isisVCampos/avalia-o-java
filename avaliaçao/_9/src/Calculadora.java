public class Calculadora {
    public static void main(String[] args) {

        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();


        double a = 10.0;
        double b = 5.0;

        System.out.println("Soma: " + soma.calcular(a, b));
        System.out.println("Subtração: " + subtracao.calcular(a, b));
        System.out.println("Multiplicação: " + multiplicacao.calcular(a, b));
        System.out.println("Divisão: " + divisao.calcular(a, b));


        System.out.println("Divisão por zero: " + divisao.calcular(a, 0)); 
    }
}
