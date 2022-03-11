package exercicio4.aplicacao;
import exercicio4.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

/***
 * Instancie o objeto e a Lista<Pessoa>, adicione os dados,
 * e imprima o nome da pessoa mais velha.
 * */

public class Exercicio4 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 15);
        Pessoa pessoa2 = new Pessoa("Leandro", 21);
        Pessoa pessoa3 = new Pessoa("Paulo", 17);
        Pessoa pessoa4 = new Pessoa("Jessica", 18);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        int idadeMaisAlta = 0;
        String nomePessoaMaisVelha = null;
        for (int i = 0; i < pessoas.size(); i++) {
            int idade = pessoas.get(i).getIdade();
            if (idade > idadeMaisAlta) {
                nomePessoaMaisVelha = pessoas.get(i).getNome();
                idadeMaisAlta = idade;
            }
        }
        System.out.println(nomePessoaMaisVelha);
    }
}
