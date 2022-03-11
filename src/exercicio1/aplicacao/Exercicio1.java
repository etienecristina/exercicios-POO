package exercicio1.aplicacao;

import exercicio1.entidades.Veiculo;

/**
 * Seguindo o diagrama UML a seguir, implemente a classe Veiculo e seus
 * métodos.
 * Após a implementação, testar cada um dos métodos via console.
 * acelerar(): este método acrescenta um valor de +20 no atributo velocidade.
 * abastecer(int combustivel): recebe como parâmetro uma quantidade de
 * combustível e atribui a listrosCombustivel. OBS: O limite do tanque de
 * combustível é de 60 litros, validar para não ultrapassar.
 * frear(): a cada chamada do método diminui a velocidade em 20. Não
 * aceitar a chamada do método se o veiculo estiver parado.
 * pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
 * ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
 * desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga
 * o carro.
 * Não permitir que desligue o veículo com velocidade > 0.
 * */

public class Exercicio1 {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("volks","fusca","ABC","branco",10000.00f,true,20,20,5000.00);

        veiculo.ligar();
        veiculo.acelerar();
        veiculo.abastecer(20);
        veiculo.abastecer(21);
        veiculo.desligar();
        veiculo.frear();
        veiculo.ligar();
        veiculo.pintar("amarelo");
    }
}
