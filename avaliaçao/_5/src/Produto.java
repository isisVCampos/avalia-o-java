public interface Produto {

    String nome = null;
    int quantidade = 0;

    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
    String getNome();
    int getQuantidade();
}