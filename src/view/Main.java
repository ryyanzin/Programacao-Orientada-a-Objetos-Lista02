package view;

import model.Produto;

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto(
                1,
                "Massa de Tapioca",
                6,
                7
        );

        produto.exibirInfo(); //Imprime o preço ainda positivo
        produto.setPreco(-5); //Altera preço para negativo
        produto.exibirInfo(); //Não imprime o preço, pois está negativo

    }

}