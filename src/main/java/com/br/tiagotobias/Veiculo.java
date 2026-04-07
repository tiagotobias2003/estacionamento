package com.br.tiagotobias;

public class Veiculo {

    // Atributos privados (Encapsulamento: protegendo os dados do acesso direto)
    private String placa;
    private String modelo;

    // --- CONSTRUTOR ---
    // O construtor é o "momento do nascimento" do objeto.
    // Aqui, estamos obrigando que todo veículo criado já venha com placa e modelo.
    // Não faz sentido existir um carro fantasma sem placa no nosso sistema!
    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // --- GETTERS E SETTERS (As portas de acesso) ---
    // Como os atributos são 'private', precisamos de métodos 'public' para
    // ler (get) e modificar (set) essas informações de forma controlada.

    // Método para ler qual é a placa do carro
    public String getPlaca() {
        return placa;
    }

    // Método para corrigir a placa, caso o atendente tenha digitado errado
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método para ler qual é o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Método para corrigir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}