public class GerenciadorVeiculos {
    public static void main(String[] args) {

        Onibus onibus = new Onibus("ABC-1234", 2015, 40);
        Caminhao caminhao = new Caminhao("XYZ-5678", 2018, 4);


        System.out.println("Informações do Ônibus:");
        onibus.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do Caminhão:");
        caminhao.exibirInformacoes();
    }
}
