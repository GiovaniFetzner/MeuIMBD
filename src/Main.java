public class Main {

    public static void main(String[] args) {

        ColecaoArquivos videoKlip = new ColecaoArquivos();

        ArquivoDigital filme01 = new ArquivoDigital(123, 2023, "Oppenheimer", "Crystopher Nolan",
                "Cillian M.", Categoria.FILME);

        ArquivoDigital serie01 = new ArquivoDigital(321, 2023, "Ragnarok", "Desconhecido",
                "Desconhecido", Categoria.SERIADO);

        //System.out.println(filme01.Informacoes());

        videoKlip.adicionaObra(0,serie01);
        videoKlip.adicionaObra(9,filme01);
        System.out.println("Verificação se possui algum arquivo na posição 8: " + videoKlip.consultaPosicao(8));
        System.out.println(" -- Colecao de arquivos -- ");

        for (int i = 0; i < 10 ; i++){
            System.out.println(videoKlip.consultaPosicao(i));
        }






        }

}