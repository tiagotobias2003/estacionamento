package com.br.tiagotobias;

public class Vaga {

    // Atributos privados (Encapsulamento)
    private int numero;
    private boolean ocupada;
    private Veiculo veiculoEstacionado; // Relacionamento: a Vaga "tem um" Veiculo

    // --- CONSTRUTOR ---
    // Quando criamos uma vaga, ela só precisa saber o seu número.
    // Por padrão, toda vaga nasce desocupada e sem nenhum carro nela.
    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.veiculoEstacionado = null; // null significa "vazio" ou "nenhum objeto"
    }

    // --- MÉTODOS DE AÇÃO ---

    // Método para estacionar um carro nesta vaga
    public void estacionar(Veiculo carro) {
        this.veiculoEstacionado = carro; // Guarda o objeto do carro na vaga
        this.ocupada = true;             // Muda o status da vaga para ocupada
    }

    // Método para liberar a vaga quando o carro for embora
    public void liberar() {
        this.veiculoEstacionado = null;  // Remove o carro da vaga (volta a ser vazio)
        this.ocupada = false;            // Muda o status da vaga para livre
    }

    // --- GETTERS (Métodos de acesso) ---

    public int getNumero() {
        return numero;
    }

    // Para atributos booleanos (verdadeiro/falso), o padrão Java é usar "is" em vez de "get"
    public boolean isOcupada() {
        return ocupada;
    }

    public Veiculo getVeiculoEstacionado() {
        return veiculoEstacionado;
    }
}