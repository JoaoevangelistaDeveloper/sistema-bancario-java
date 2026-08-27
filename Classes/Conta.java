package SistemaBancario.Classes;

import SistemaBancario.Enum.TipoConta;
import SistemaBancario.Servico.Formatador;
import SistemaBancario.Servico.Movimentacao;

import java.util.ArrayList;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Movimentacao> movimentacoes;
    private TipoConta tipo;

    public Conta(int numeroConta, double saldo, Cliente cliente, TipoConta tipo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.movimentacoes = new ArrayList<>();
        this.tipo = tipo;
    }

    public void aplicarRendimento(){
        double rendimento = tipo.calcularRendimento(saldo);
        saldo += rendimento;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        this.movimentacoes.add(movimentacao);
    }

    public ArrayList<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "=============================\n" +
                "Conta Bancária" + "\nNúmero: " + numeroConta  + "\nSaldo: " + Formatador.formatarMoeda(saldo) +
                "\nTipo da conta: " + tipo +
                "\n=============================\n";
    }
}
