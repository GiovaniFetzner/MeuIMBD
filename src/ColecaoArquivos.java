public class ColecaoArquivos {

    private ArquivoDigital[] ColecaoArquivos;
    private final int MAX_NUMERO_ELEMENTOS = 10;
    private static final int POSICAO_INVALIDA = -1;

    public ColecaoArquivos() {
        ColecaoArquivos = new ArquivoDigital[MAX_NUMERO_ELEMENTOS];
    }

    public boolean adicionaObra(int posicao, ArquivoDigital midia) {
        ColecaoArquivos[posicao] = midia;
        return true;
    }

    public int consultaPosicao(int posicao) {
        if (posicao >= MAX_NUMERO_ELEMENTOS || ColecaoArquivos[posicao] == null) {
            return POSICAO_INVALIDA;
        }
        return posicao;
    }

    public ArquivoDigital[] getColecaoArquivos() {
        return ColecaoArquivos;
    }

    /*public Boolean consultaPosicao() {
        if (ColecaoArquivos[i] != null) {
                return true;
            } else {
                return false;
            }
    }*/

}
