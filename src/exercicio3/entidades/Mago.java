package exercicio3.entidades;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
    private List<String> magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magia = magia;
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public void levelUp() {
                System.out.println(String.format("%s subiu de nível!\nDados antes do Level Up:\nMana: %d, Inteligência: %d, Vidas: %d, Força: %d ",
                getNome(), getMana(), getInteligencia(), getVida(), getForca()));

        this.setMana(getMana() + 2);
        this.setInteligencia(getInteligencia() + 2);
        this.setVida(getVida() + 1);
        this.setForca(getForca() + 1);

        System.out.println(String.format("Dados depois do Level Up:\nMana: %d, Inteligência: %d, Vidas: %d, Força: %d ",
                getMana(), getInteligencia(), getVida(), getForca()));
    }


    /**
     * Implemente o método attack() de forma que siga a seguinte regra:
     * Mago: ( Inteligência * Level ) + numeroRandomico( 0 até 300 )
     *
     * */
    @Override
    public void attack() {
        Random random = new Random();
        int ataqueMago = (this.getInteligencia() * this.getLevel()) + random.nextInt(300);
        System.out.println(String.format("Ataque do %s: %d", getNome(), ataqueMago));
    }

    @Override
    public String toString() {
        return "Mago: " + getNome() +
                "\nVida: " + getVida() +
                "\nMana: " + getMana() +
                "\nXp: " + getXp() +
                "\nInteligência: " + getInteligencia() +
                "\nForça : " + getForca() +
                "\nLevel: " + getLevel() +
                "\nMagias: " + getMagia();
    }
}
