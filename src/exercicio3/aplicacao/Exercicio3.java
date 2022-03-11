package exercicio3.aplicacao;

import exercicio3.entidades.Guerreiro;
import exercicio3.entidades.Mago;
import exercicio3.entidades.Personagem;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<String> magias = new ArrayList<>();
        magias.add("Abracadabra");
        magias.add("Estátua de gelo");
        magias.add("Invisibilidade");

        Mago mago1 = new Mago("Mestre dos Magos", 2, 5, 2500, 60, 80, 3, magias);

        List<String> habilidades = new ArrayList<>();
        habilidades.add("Velocidade da luz");
        habilidades.add("Leitura de mentes");

        Guerreiro guerreiro1 = new Guerreiro("Guerreiro Viking", 1, 6, 3000, 75, 60, 2, habilidades);

        System.out.println(mago1);
        System.out.println("\n");
        System.out.println(guerreiro1);
        System.out.println("\n");
        mago1.attack();
        mago1.levelUp();
        System.out.println("\n");
        guerreiro1.attack();
        guerreiro1.levelUp();

        System.out.println("\n");
        System.out.println("Quantidade de personagens criados: " + Personagem.quantidadeCriada);
    }
}
