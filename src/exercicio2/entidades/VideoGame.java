package exercicio2.entidades;
import exercicio2.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    public double calculaImposto() {
        double imposto;
        if (isUsado) {
            imposto = getPreco() * 0.25;
        } else {
            imposto = getPreco() * 0.45;
        }
        return imposto;
    }
}
