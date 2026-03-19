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
            return true;
            this.compras.add(Compra);
        } else {
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}
