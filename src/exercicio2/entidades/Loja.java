package exercicio2.entidades;

import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    List<Livro> livros;
    List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (livros.isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("A " + getNome() + " possui estes livros para venda: ");
            for (int i = 0; i < livros.size(); i++) {
                Livro livro = livros.get(i);
                System.out.println(String.format("Título: %s, preço: %.2f , quantidade: %d em estoque", livro.getNome(), livro.getPreco(), livro.getQuantidade()));
            }
        }
    }

    public void listaVideoGames() {
        if (videoGames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque.");
        } else {
            System.out.println("A " + getNome() + " possui estes vídeo-games para venda: ");
            for (int i = 0; i < videoGames.size(); i++) {
                System.out.println(String.format("Título: %s, preço: %.2f , quantidade: %d em estoque", videoGames.get(i).getNome(), videoGames.get(i).getPreco(), videoGames.get(i).getQuantidade()));
            }
        }
    }

    public double calculaPatrimonio() {
        double valorPatrimonio = 0;
        double valorTotalLivros = 0;
        for (int contadorLivros = 0; contadorLivros < livros.size(); contadorLivros++) {
            valorTotalLivros += livros.get(contadorLivros).getPreco() * livros.get(contadorLivros).getQuantidade();
        }
        valorPatrimonio += valorTotalLivros;

        double valorTotalVideoGames = 0;
        for (int contadorVideoGames = 0; contadorVideoGames < videoGames.size(); contadorVideoGames++) {
            valorTotalVideoGames += videoGames.get(contadorVideoGames).getPreco() * videoGames.get(contadorVideoGames).getQuantidade();
        }
        valorPatrimonio += valorTotalVideoGames;

        System.out.println("O patrimônio da " + getNome() + " é de R$ " + valorPatrimonio);
        return valorPatrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }
}
