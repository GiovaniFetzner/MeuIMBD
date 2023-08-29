public class Repositorio {

    private ArquivoDigital[] ColecaoArquivos;
    private final int MAX_NUMERO_ELEMENTOS = 10;
    public static final int POSICAO_INVALIDA = -1;

    public Repositorio() {
        ColecaoArquivos = new ArquivoDigital[MAX_NUMERO_ELEMENTOS];
    }

    public boolean AdicionaObra(int posicao, ArquivoDigital midia) {
        ColecaoArquivos[posicao] = midia;
        return true;
    }

    public String MostraColecao(int posicao) {
        if (posicao >= MAX_NUMERO_ELEMENTOS || ColecaoArquivos[posicao] == null) {
            return null;
        }
        return ColecaoArquivos[posicao].Informacoes();
    }

    public int MostraColecao() {
        for (int i = 0; i < ColecaoArquivos.length; i++){
            if (ColecaoArquivos[i] != null) {
                return ColecaoArquivos[posicao];
            } else {
                return POSICAO_INVALIDA;
            }
        }
    }

}
