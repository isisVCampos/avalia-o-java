public class Pessoajuridica implements Imposto{
    private double rendaanul;

    @Override
    public double calcularImposto() {
        return rendaanul/100*10;

    }


    public Pessoajuridica(double rendaanul) {
        this.rendaanul = rendaanul;
    }
}
