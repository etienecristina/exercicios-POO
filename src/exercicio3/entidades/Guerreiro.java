package exercicio3.entidades;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
    private List<String> habilidades;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidades) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidades = habilidades;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void levelUp() {
        System.out.println(String.format("%s subiu de nível!\nDados antes do Level Up:\nMana: %d, Inteligência: %d, Vidas: %d, Força: %d",
                getNome(), getMana(), getInteligencia(), getVida(), getForca()));
        this.setVida(getVida() + 2);
        this.setForca(getForca() + 2);
        this.setMana(getMana() + 1);
        this.setInteligencia(getInteligencia() + 1);
        System.out.println(String.format("Dados depois do Level Up:\nMana: %d, Inteligência: %d, Vidas: %d, Força: %d",
                getMana(), getInteligencia(), getVida(), getForca()));
    }

    /**
     * Implemente o método attack() de forma que siga a seguinte regra:
     * Guerreiro: (  Força * Level ) + numeroRandomico( 0 até 300 ).
     * */
    @Override
    public void attack() {
        Random random = new Random();
        int ataqueGuerreiro = (this.getForca() * this.getLevel()) + random.nextInt(300);
        System.out.println(String.format("Ataque do %s: %d", getNome(), ataqueGuerreiro));
    }

    @Override
    public String toString() {
        return "Guerreiro: " + getNome() +
                "\nVida: " + getVida() +
                "\nMana: " + getMana() +
                "\nXp: " + getXp() +
                "\nInteligência: " + getInteligencia() +
                "\nForça : " + getForca() +
                "\nLevel: " + getLevel() +
                "\nHabilidades: " + getHabilidades();
    }
}
