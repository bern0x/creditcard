package br.com.alura.creditcard.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {

    private double saldo;
    private double limite;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancamentoCompra(Compra compra) {
        if (compra.getValor() <= this.saldo) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            System.out.println("Compra realizada!");
            return true;
        } else {
            System.out.println("Compra fracassada, saldo insuficiente");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
