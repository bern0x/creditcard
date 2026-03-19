package br.com.alura.creditcard.principal;


import br.com.alura.creditcard.modelos.CartaoCredito;
import br.com.alura.creditcard.modelos.Usuario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Usuario usuario1 = new Usuario();
        System.out.print("Digite seu nome: ");
        String nome = in.nextLine();
        usuario1.setNome(nome);

        System.out.print("Digite seu ID: ");
        int id = in.nextInt();
        usuario1.setId(id);

        CartaoCredito cartao1 = new CartaoCredito(150);
        System.out.println();
        System.out.print(usuario1.getNome() + ", digite o limte do cartão: ");
        double limite = in.nextDouble();











    }
}
