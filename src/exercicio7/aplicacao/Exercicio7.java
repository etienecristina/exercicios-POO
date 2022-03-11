package exercicio7.aplicacao;

import exercicio7.entidades.Gerente;
import exercicio7.entidades.Supervisor;
import exercicio7.entidades.Vendedor;

/**
 * Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de
 * nome Funcionário com os seguintes atributos (nome, idade e salário) e mais
 * três classes Filhas: Gerente, Supervisor e Vendedor)
 * */

public class Exercicio7 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Etiene", 26, 12000);
        Supervisor supervisor = new Supervisor("João", 31, 10000);
        Vendedor vendedor = new Vendedor("José", 28, 5000);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
