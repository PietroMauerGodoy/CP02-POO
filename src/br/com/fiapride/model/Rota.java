package br.com.fiapride.model;

/**
 * Representa uma rota de entrega, associando um pacote a qualquer veículo.
 */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo; // aceita Caminhao, Moto, ou qualquer subclasse futura

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    /**
     * Inicia a entrega, exibindo as informações da rota.
     */
    public void iniciarEntrega() {
        System.out.println(
                "Levando pacote " + pacote.getCodigo() +
                        " no veículo " + veiculo.getPlaca()
        );
        pacote.atualizarStatus("Em trânsito");
    }
}