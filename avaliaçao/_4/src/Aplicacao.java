public class Aplicacao {
    public static void main(String[] args) {

        Pedidos pedido = new Pedidos();


        pedido.adicionarItem("Hambúrguer", 12.50);
        pedido.adicionarItem("Batata Frita", 6.00);
        pedido.adicionarItem("Refrigerante", 4.50);


        pedido.exibirPedido();

        System.out.println("Valor total: R$ " + pedido.calcularTotal());
    }
}
