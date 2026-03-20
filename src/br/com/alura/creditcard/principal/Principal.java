package br.com.alura.creditcard.principal;

import br.com.alura.creditcard.modelos.CartaoCredito;
import br.com.alura.creditcard.modelos.Compra;
import br.com.alura.creditcard.modelos.Usuario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Usuario usuario1 = new Usuario();
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();
        usuario1.setNome(nome);

        System.out.print(usuario1.getNome() + ", digite o limte do cartão: ");
        double limite = in.nextDouble();
        CartaoCredito cartao1 = new CartaoCredito(limite);

        System.out.println();
        System.out.print("\nDigite a descrição da compra: ");
        String descricao = in.nextLine();
        System.out.print("\nDigite o valor da compra: ");
        double valor = in.nextDouble();
        Compra compra1 = new Compra(descricao, valor);
        cartao1.lancamentoCompra(compra1);

        int menu = 0;
        System.out.println("---- MENU ----" +
                "0 - Para sair" +
                "1 - Para continuar" +
                "2 - Para emitir a fatura");

        do
            switch (menu) {
            case 1:
                System.out.println();
                System.out.print("Digite a descrição da compra: ");
                descricao = in.nextLine();
                System.out.print("Digite o valor da compra: ");
                valor = in.nextDouble();
                compra1 = new Compra(descricao, valor);
                cartao1.lancamentoCompra(compra1);

            case 2:
                System.out.println();
                System.out.println("*******" +
                        "--- FATURA ---" +
                        "" + cartao1.toString());
                break;
            }
        while (menu == 0);


    }
}
