package model;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto (int codigo, String nome, double preco, int estoque) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;

    }

    //Getter

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    //Setter

    public void setPreco(double preco) {
          this.preco = preco;
    }

    //Metodo

    public void exibirInfo() {

        if (preco < 0) System.out.println("\nApós a desvalorização da massa de tapioca: \n Código = " + codigo + "\n Produto = " + nome + "\n Preço inválido " + "\n Estoque = " + estoque);
        else System.out.println("\nAntes da desvalorização da massa de tapioca: \n Código = " + codigo + "\n Produto = " + nome + "\n Preço = " + preco + "\n Estoque = " + estoque);

    }

}
