public class Repositorio {

    private ArquivoDigital[] ColecaoArquivos;
    private final int MAX_NUMERO_ELEMENTOS = 10;

    public Repositorio() {
        ColecaoArquivos = new ArquivoDigital[MAX_NUMERO_ELEMENTOS];
    }

    public boolean AdicionaObra(int posicao, ArquivoDigital midia){
        ColecaoArquivos[posicao] = midia;
        return true;
    }

    public String MostraColecao(int posicao){
        return ColecaoArquivos[posicao].Informacoes();
    }

 /*   public String MostraColecao(){
        for (int i = 0; i < ColecaoArquivos.length, i++){
            if (ColecaoArquivos[i] != null) {
                String informacoes = ArquivoDigital.Informacoes();
                return informacoes;
            } else return null;
        }
    }*/

}
