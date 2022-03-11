package exercicio6;

import exercicio4.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;


/**
* Aproveitando – o seu código já escrito na questão 4 e na Questão 5 –
* Consulte se o objeto Jessica existe na lista e exiba a sua idade.
* */

public class Exercicio6 {
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

        System.out.println(pessoas.size());

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getIdade() < 18) {
                pessoas.remove(i);
            }
        }
        System.out.println(pessoas.size());

        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            if ("Jessica".equals(pessoa.getNome())) {
                System.out.println("O objeto Jéssica existe na lista, sua idade é: " + pessoa.getIdade());
            }
        }
    }
}
