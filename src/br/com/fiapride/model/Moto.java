package br.com.fiapride.model;

/**
 * Representa uma moto de entrega. Herda atributos comuns de Veiculo.
 */
public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() { return possuiBau; }
}