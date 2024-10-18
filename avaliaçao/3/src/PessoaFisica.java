public class PessoaFisica implements Imposto{
    private double rendaanul;
    @Override
    public double calcularImposto() {
        return rendaanul/100*20;
    }

    public double getRendaanul() {
        return rendaanul;
    }

    public PessoaFisica(double rendaanul) {
        this.rendaanul = rendaanul;

    }
}
