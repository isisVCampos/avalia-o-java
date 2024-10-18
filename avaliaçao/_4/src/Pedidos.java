import java.util.ArrayList;
import java.util.List;

public class Pedidos implements PedidosRestaurante {

    private List<String> itens;
    private List<Double> precos;
    public Pedidos() {
        itens = new ArrayList<>();
        precos = new ArrayList<>();
    }

    @Override
    public void adicionarItem(String item, double preco) {
        itens.add(item);
        precos.add(preco);
    }


    @Override
    public double calcularTotal() {
        double total = 0;
        for (double preco : precos) {
            total += preco;
        }
        return total;
    }


    public void exibirPedido() {
        System.out.println("Itens do pedido:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i) + ": R$ " + precos.get(i));
        }
    }
}
