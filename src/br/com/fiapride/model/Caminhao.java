package br.com.fiapride.model;

/**
 * Representa um caminhão de entrega. Herda atributos comuns de Veiculo.
 */
public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    public Caminhao(String placa, double capacidadeKg, int quantidadeEixos) {
        super(placa, capacidadeKg); // chama o construtor de Veiculo
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() { return quantidadeEixos; }
}