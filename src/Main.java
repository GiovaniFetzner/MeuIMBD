import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ColecaoArquivos videoKlip = new ColecaoArquivos();

        ArquivoDigital filme01 = new ArquivoDigital(123, 2023, "Oppenheimer", "Crystopher Nolan",
                "Cillian M.", Categoria.FILME, Genero.ACAO);

        ArquivoDigital filme02 = new ArquivoDigital(123, 1999, "A espera de um milagre", "Tom Hanks",
                "Michael C.", Categoria.FILME, Genero.DRAMA,Streaming.NETFLIX,Streaming.AMAZON_PRIME);

        ArquivoDigital serie01 = new ArquivoDigital(321, 2023, "Ragnarok", "Desconhecido",
                "Desconhecido", Categoria.SERIADO, Genero.FICCAO);

        ArquivoDigital serie02 = new ArquivoDigital(321, 1984, "Dragon Ball", "Akira Toriyama",
                "Goku", Categoria.SERIADO, Genero.ANIMACAO);

        //System.out.println(filme02.informacoes());

        System.out.println("Informações do filme criado usando a list: "+ filme02.getStreaming());
        System.out.println("Informações do filme criado usando a list: "+ filme01.getStreaming());
        filme01.adicionaPlataformaStreaming(Streaming.NETFLIX);
        System.out.println("Informações do filme criado usando a list: "+ filme01.getStreaming());

        videoKlip.adicionaObra(0, serie01);
        videoKlip.adicionaObra(9, filme01);
        videoKlip.adicionaObra(8, filme02);
        videoKlip.adicionaObra(serie02);
        System.out.println("Verificação se possui algum arquivo na posição 1: " + videoKlip.consultaPosicao(1));
        System.out.println("Verificação posicao da serie02: " + videoKlip.consultaPosicao(serie02));
        System.out.println("Confere numero de elementos na lista: " + videoKlip.getNumeroDeElementos());
        System.out.println("Tamanho da coleção: " + videoKlip.getTamanhoColecao());
        System.out.println(" -- Verifica posições na lista -- ");

        for (int i = 0; i < 10; i++) {
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