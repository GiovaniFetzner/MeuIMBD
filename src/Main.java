import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ColecaoArquivos videoKlip = new ColecaoArquivos();

        ArquivoDigital filme01 = new ArquivoDigital(123, 2023, "Oppenheimer", "Crystopher Nolan",
                "Cillian M.", Categoria.FILME);

        ArquivoDigital filme02 = new ArquivoDigital(123, 1999, "A espera de um milagre", "Tom Hanks",
                "Michael C.", Categoria.FILME);

        ArquivoDigital serie01 = new ArquivoDigital(321, 2023, "Ragnarok", "Desconhecido",
                "Desconhecido", Categoria.SERIADO);

        ArquivoDigital serie02 = new ArquivoDigital(321, 1984, "Dragon Ball", "Akira Toriyama",
                "Goku", Categoria.SERIADO);

        //System.out.println(filme02.informacoes());

        videoKlip.adicionaObra(0,serie01);
        videoKlip.adicionaObra(9,filme01);
        videoKlip.adicionaObra(8,filme02);
        videoKlip.adicionaObra(serie02);
        videoKlip.removeOBra(serie02);
        System.out.println("Verificação se possui algum arquivo na posição 1: " + videoKlip.consultaPosicao(1));
        System.out.println("Verificação posicao da serie02: " + videoKlip.consultaPosicao(serie02));
        System.out.println(" -- Verifica posições na lista -- ");

        for (int i = 0; i < 10 ; i++){
            System.out.println(videoKlip.consultaPosicao(i));
        }

        System.out.println(" -- Consulta lista -- ");

        ArquivoDigital[] lista = videoKlip.getColecaoArquivos();
        listagemColecao(lista);


    }

    private static void listagemColecao(ArquivoDigital[] colecaoArquivos) {
        for (ArquivoDigital colecaoArquivo : colecaoArquivos) {
            if (colecaoArquivo != null) {
                ArquivoDigital midia = colecaoArquivo;
                System.out.println(midia.informacoes());
            }
        }
    }

}