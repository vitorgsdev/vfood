package Classes;

import java.util.Scanner;
import java.util.ArrayList;

public class Pedido {
    static Scanner entrada = new Scanner(System.in);

    public static ArrayList<Pedido> listaPedidos = new ArrayList<>();

    private int codigoPedido;
    private int codigoMesa;
    private double valorPedido;
    private String nomePedido;
    private String categoriaPedido;

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(int codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getCategoriaPedido() {
        return categoriaPedido;
    }

    public void setCategoriaPedido(String categoriaPedido) {
        this.categoriaPedido = categoriaPedido;
    }
    
   
    public void cadastrarPedido(int codigoPedido, int codigoMesa, double precoPedido, String nomePedido, String categoriaPedido) {
        this.codigoPedido = codigoPedido;
        this.codigoMesa = codigoMesa;
        this.valorPedido = precoPedido;
        this.nomePedido = nomePedido;
        this.categoriaPedido = categoriaPedido;
    }
    
    public static int gerarCodigoPedido() {
        int ultimaPosicao = listaPedidos.size() - 1;
        int proximoCodigo;
        if (ultimaPosicao == -1) {
            proximoCodigo = 1000;
        } else {
            int ultimoCodigo = listaPedidos.get(ultimaPosicao).getCodigoPedido();
            proximoCodigo = ultimoCodigo + 1;
        }
        return proximoCodigo;
    }

    public void removerPedido() {

    }
}
