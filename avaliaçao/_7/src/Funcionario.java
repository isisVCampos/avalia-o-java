public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public void addAumento(double valor) {
        this.salario += valor;
    }


    public double ganhoAnual() {
        return salario * 12;
    }


    public String getNome() {
        return nome;
    }
}
