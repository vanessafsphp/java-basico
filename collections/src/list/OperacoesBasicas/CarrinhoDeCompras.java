package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }

            itemList.removeAll(itensParaRemover);

        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        double valorItem = 0d;
        
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }

            return valorTotal;

        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Produto 1", 10.00, 2);
        carrinhoDeCompras.adicionarItem("Produto 2", 5.50, 1);
        carrinhoDeCompras.adicionarItem("Produto 3", 5.00, 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("\nValor total da compra é de: R$ " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Produto 2");
        carrinhoDeCompras.exibirItens();
        System.out.println("\nValor total da compra é de: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
