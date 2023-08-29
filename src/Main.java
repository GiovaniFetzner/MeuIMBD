public class Main {

    public static void main(String[] args) {

        Repositorio VideoKlip = new Repositorio();

        ArquivoDigital filme01 = new ArquivoDigital(123, 2023, "Oppenheimer", "Crystopher Nolan",
                "Cillian M.", Categoria.FILME);

        ArquivoDigital serie01 = new ArquivoDigital(321, 2023, "Ragnarok", "Desconhecido",
                "Desconhecido", Categoria.SERIADO);

        //System.out.println(filme01.Informacoes());

        VideoKlip.AdicionaObra(0,serie01);
        System.out.println(VideoKlip.MostraColecao(0));





        }

}