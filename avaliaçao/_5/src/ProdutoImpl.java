public class ProdutoImpl implements Produto {


    private String nome;
    private int quantidade;


    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }


    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque.");
    }


    @Override
    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else {
            System.out.println("Quantidade insuficiente em estoque. Não é possível remover " + quantidade + " unidades.");
        }
    }

    @Override
    public String getNome() {
        return this.nome;
    }


    @Override
    public int getQuantidade() {
        return this.quantidade;
    }
}
