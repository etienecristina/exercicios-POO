package exercicio2.aplicacao;

import exercicio2.entidades.Livro;
import exercicio2.entidades.Loja;
import exercicio2.entidades.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", 10.00, 10, "JK Rowling", "Fantasia", 200);
        Livro livro2 = new Livro("Crepúsculo", 50.00, 1, "Sthefanie Meyer", "educativo", 100);
        Livro livro3 = new Livro("Sítio do pica-pau amarelo", 100.00, 2, "Vinicius de Moraes", "Folclore", 50);

        VideoGame videoGame1 = new VideoGame("PlayStation", 500.00, 2, "Sony", "Slim", true);
        VideoGame videoGame2 = new VideoGame("XBox", 800.00, 1, "Microsoft", "One", false);
        VideoGame videoGame3 = new VideoGame("Desconhecido", 200.00, 3, "Desconhecida", "Desconhecido", true);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        List<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(videoGame1);
        videoGames.add(videoGame2);
        videoGames.add(videoGame3);

        Loja americanas = new Loja("Lojas Americanas", "123456", livros, videoGames);

        livro1.calculaImposto();
        livro2.calculaImposto();
        livro3.calculaImposto();

        videoGame1.calculaImposto();
        videoGame2.calculaImposto();
        videoGame3.calculaImposto();

        System.out.println("-----------------------------");
        americanas.listaLivros();
        System.out.println("-----------------------------");
        americanas.listaVideoGames();
        System.out.println("-----------------------------");
        americanas.calculaPatrimonio();
    }
}
