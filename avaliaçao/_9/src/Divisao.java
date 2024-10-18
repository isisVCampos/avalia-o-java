public class Divisao extends Operacao {

    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }
}
