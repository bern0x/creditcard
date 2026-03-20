package br.com.alura.creditcard.principal;

import br.com.alura.creditcard.modelos.CartaoCredito;
import br.com.alura.creditcard.modelos.Compra;
import br.com.alura.creditcard.modelos.Usuario;

import java.util.Collections;
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

        in.nextLine();
        // Limpa o buffer

        System.out.println();
        System.out.print("Digite a descrição da compra: ");
        String descricao = in.nextLine();
        System.out.print("Digite o valor da compra: ");
        double valor = in.nextDouble();
        Compra compra1 = new Compra(descricao, valor);
        cartao1.lancamentoCompra(compra1);

        int menu = 0;

        System.out.println("\n---- MENU ----");
        System.out.println("1 - Para continuar");
        System.out.println("2 - Para emitir fatura");
        System.out.println("0 - Para sair");
        menu = in.nextInt();

        do {

            System.out.println("\n---- MENU ----");
            System.out.println("1 - Para continuar");
            System.out.println("2 - Para emitir fatura");
            System.out.println("0 - Para sair");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    in.nextLine();
                    // Limpa o buffer

                    System.out.println();
                    System.out.print("Digite a descrição da compra: ");
                    descricao = in.nextLine();
                    System.out.print("Digite o valor da compra: ");
                    valor = in.nextDouble();
                    compra1 = new Compra(descricao, valor);
                    cartao1.lancamentoCompra(compra1);

                case 2:

                    System.out.println("\n***************");
                    System.out.println("--- FATURA ---");
                    Collections.sort(cartao1.getCompras());
                    for (Compra c : cartao1.getCompras()) {
                        System.out.println(c.getDescricao() + " - " + c.getValor());
                    }
                    System.out.println("\n***************");
                    System.out.println("\nSaldo do cartão: " + cartao1.getSaldo());

            }
        }
        while (menu != 0);


    }
}
