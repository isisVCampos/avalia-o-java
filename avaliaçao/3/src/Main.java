public class Main {
    public static void main(String[] args) {
    Imposto[] impostos = new Imposto[2];

    impostos[0]= new Pessoajuridica(1000);
    impostos[1]= new PessoaFisica(44444);

        for (Imposto  imposto : impostos) {
            System.out.println("Imposto calculado"+ imposto.calcularImposto());

        }

    }
}