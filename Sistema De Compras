package pacote;
import java.util.ArrayList;
import java.util.List;

class Produto {
    public String nome;
    public double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}

class ItemCarrinho {
    public Produto produto;
    public int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularSubtotal() {
        return produto.getValor() * quantidade;
    }
}

class CarrinhoDeCompras {
    public List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto, quantidade));
    }

    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (ItemCarrinho item : itens) {
            System.out.println("Produto: " + item.getProduto().getNome() + ", Quantidade: " + item.getQuantidade() +
                    ", Preço unitário: R$" + item.getProduto().getValor());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}

public class carrinho {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Vestido Preto", 120);
        Produto produto2 = new Produto("Coturno Bege", 170);
        Produto produto3 = new Produto("Lenço Xadrez, Branco e Rosa", 90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem(produto1, 3);
        carrinho.adicionarItem(produto2, 1);
        carrinho.adicionarItem(produto3, 5);

        carrinho.listarProdutos();

        System.out.println("\nValor total do carrinho: R$" + carrinho.calcularTotal());
    }
}
