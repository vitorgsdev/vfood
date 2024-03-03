package Classes;

import java.util.Scanner;
import java.util.ArrayList;

public class Produto {

    public static Scanner entrada = new Scanner(System.in);

    public static ArrayList<Produto> listaProdutos = new ArrayList<>();

    private int codigoProduto;
    private String nomeProduto;
    private String categoriaProduto;
    private double precoProduto;
    private int qtdProdutoTotal;
    private int qtdProdutoDisponivel;

    public int getCodProduto() {
        return codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoriaProduto;
    }

    public void setCategoria(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQtdProdutoTotal() {
        return qtdProdutoTotal;
    }

    public void setQtdProdutoTotal(int qtdProdutoTotal) {
        this.qtdProdutoTotal = qtdProdutoTotal;
    }

    public int getQtdProdutoDisponivel() {
        return qtdProdutoDisponivel;
    }

    public void setQtdProdutoDisponivel(int qtdProdutoDisponivel) {
        this.qtdProdutoDisponivel = qtdProdutoDisponivel;
    }
    
    public static void preCadastroProduto() {
        Produto produto = new Produto();
        produto.cadastrarProduto(100, "X-Tudo", "Sanduíche", 20, 30);
        listaProdutos.add(produto);
        produto = new Produto();
        produto.cadastrarProduto(101, "Coca Cola", "Bebida", 5, 100);
        listaProdutos.add(produto);
        produto = new Produto();
        produto.cadastrarProduto(102, "Pizza Calabresa", "Pizza", 50, 20);
        listaProdutos.add(produto);
        produto = new Produto();
        produto.cadastrarProduto(103, "Combo X-Tudo", "Combos", 30, 30);
        listaProdutos.add(produto);
        produto = new Produto();
        produto.cadastrarProduto(104, "Batata Frita Média", "Porções", 20, 30);
        listaProdutos.add(produto); 
    }

    public void cadastrarProduto(int codigoProduto, String nomeProduto, String categoriaProduto, double precoProduto, int qtdProdutoTotal) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.categoriaProduto = categoriaProduto;
        this.precoProduto = precoProduto;
        this.qtdProdutoTotal = qtdProdutoTotal;
        this.qtdProdutoDisponivel = this.qtdProdutoTotal;
    }

    public static int gerarCodigo_Produto() {
        int ultimaPosicao = listaProdutos.size() - 1;
        int proximoCodigo;
        if (ultimaPosicao == -1) {
            proximoCodigo = 100;
        } else {
            int ultimoCodigo = listaProdutos.get(ultimaPosicao).getCodProduto();
            proximoCodigo = ultimoCodigo + 1;
        }
        return proximoCodigo;
    }

    public static void removerProduto(int linhaSelecionada) {
        listaProdutos.remove(linhaSelecionada);
    }

    public void editarProduto(String nomeProduto, String categoriaProduto, double precoProduto, int qtdProdutoTotal) {
        this.nomeProduto = nomeProduto;
        this.categoriaProduto = categoriaProduto;
        this.precoProduto = precoProduto;
        this.qtdProdutoTotal = qtdProdutoTotal;
        this.qtdProdutoDisponivel = this.qtdProdutoTotal;
    }

    public static Produto acharProduto(int cod_teste) {
        Produto produto = null;
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (cod_teste == listaProdutos.get(i).getCodProduto()) {
                produto = listaProdutos.get(i);
                break;
            }
        }
        return produto;
    }
}
