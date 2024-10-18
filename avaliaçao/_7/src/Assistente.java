public class Assistente extends Funcionario {

    public Assistente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}
