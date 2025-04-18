import com.screenmatch.modelos.Episodio;
import com.screenmatch.modelos.Movie;
import com.screenmatch.modelos.Serie;
import com.screenmatch.modelos.calculos.CalculadoraDeTempo;
import com.screenmatch.modelos.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie();
        meuFilme.setNome("Rio");
        meuFilme.setAnoDeLancamento(2016);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);


        System.out.println("Avaliações: " + meuFilme.pegaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes() );

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost " + lost.getDuracaoEmMinutos());

        Movie otherMovie = new Movie();
        otherMovie.setNome("SEILA");
        otherMovie.setAnoDeLancamento(2020);
        otherMovie.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(otherMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio)
        ;

        var filmeSeiLa = new Movie();
        filmeSeiLa.setNome("Ark");
        filmeSeiLa.setDuracaoEmMinutos(150);
        filmeSeiLa.setAnoDeLancamento(2000);
        filmeSeiLa.avaliaFilme(10);


        ArrayList <Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeSeiLa);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(otherMovie);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }
}
