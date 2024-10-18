public class Aplicacao {
    public static void main(String[] args) {

        ProdutoImpl produto = new ProdutoImpl("Camiseta", 50);


        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());


        produto.adicionarQuantidade(20);
        System.out.println("Quantidade em estoque após adicionar: " + produto.getQuantidade());


        produto.removerQuantidade(15);
        System.out.println("Quantidade em estoque após remover: " + produto.getQuantidade());


        produto.removerQuantidade(80);
        System.out.println("Quantidade em estoque final: " + produto.getQuantidade());
    }
}
