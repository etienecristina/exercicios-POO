package exercicio1.entidades;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public Veiculo(String marca,
                   String modelo,
                   String placa,
                   String cor,
                   float km,
                   boolean isLigado,
                   int litrosCombustivel,
                   int velocidade,
                   double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        this.velocidade += 20;
        System.out.println("Carro acelerado");
    }

    public void abastecer(int litrosAAbastecer) {
        int totalLitrosAposAbastecimento = this.litrosCombustivel + litrosAAbastecer;
        int limiteTanque = 60;
        if (totalLitrosAposAbastecimento <= limiteTanque) {
            System.out.println("Abastecimento de " + litrosAAbastecer + " litros efetuado.");
            this.litrosCombustivel += litrosAAbastecer;
        } else {
            System.out.println("Não é possível abastecer, pois o limite do tanque foi atingido.");
        }
    }

    public void frear() {
        if (isLigado) {
            velocidade -= 20;
        } else {
            System.out.println("O veículo já está parado");
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("O carro foi pintado da cor " + cor);
    }

    public void ligar() {
        if (!isLigado) {
            System.out.println("Ligar o carro.");
        }
    }

    public void desligar() {
        if (isLigado) {
            if (velocidade > 0) {
                System.out.println("Não é possível desligar, pois o carro está em movimento");
            } else {
                System.out.println("Carro já se encontra desligado");
            }
        }
    }
}
