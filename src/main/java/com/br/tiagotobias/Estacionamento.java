package com.br.tiagotobias;

import java.util.ArrayList; // Importação necessária para usar listas no Java

public class Estacionamento {

    // Nossas listas dinâmicas. O ArrayList precisa saber qual "tipo" de objeto vai guardar, usando os < >
    private ArrayList<Vaga> vagas;

    // --- CONSTRUTOR ---
    public Estacionamento(int totalDeVagas ) {

        // 1. Inicializamos as listas (criamos as listas vazias na memória)
        this.vagas = new ArrayList<>();

        // 2. Preenchendo a lista de vagas automaticamente ao criar o estacionamento
        for (int i = 1; i <= totalDeVagas; i++) {
            Vaga novaVaga = new Vaga(i); // Cria a vaga com o número
            this.vagas.add(novaVaga);    // Adiciona a vaga dentro do nosso ArrayList
        }
    }


    public void exibirVagasLivres() {
        System.out.println("--- Vagas Disponíveis ---");
        int contador = 0;

        // Percorre o ArrayList para mostrar apenas as vagas desocupadas
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                System.out.print("[ Vaga " + vaga.getNumero() + " ] ");
                contador++;
            }
        }
        System.out.println("\nTotal de vagas livres: " + contador);
    }
}
