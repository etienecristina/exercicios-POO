package exercicio2.entidades;
import exercicio2.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int quantidadePaginas;

    public Livro() {
    }

    public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantidadePaginas) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0;
        if ("educativo".equals(getTema())) {
            System.out.println("Livro educativo não tem imposto: " + getNome());
        } else {
            imposto = getPreco() * 0.10;
            System.out.println("R$ " + imposto + " de impostos sobre o livro " + getNome());
        }
        return imposto;
    }
}

