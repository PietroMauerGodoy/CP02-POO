package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class Principal {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC-1234", 1000.0, 4);
        Moto moto = new Moto("XYZ-5678", 30.0, true);

        Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
        Pacote pacote2 = new Pacote("BR000", 5.0, "Pendente");

        Rota rotaCaminhao = new Rota(pacote1, caminhao);
        Rota rotaMoto = new Rota(pacote2, moto);

        rotaCaminhao.iniciarEntrega();
        rotaMoto.iniciarEntrega();
    }
}