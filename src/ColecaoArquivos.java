public class ColecaoArquivos {

    private ArquivoDigital[] ColecaoArquivos;
    private final int MAX_NUMERO_ELEMENTOS = 10;
    private final int POSICAO_INVALIDA = -1;

    public ColecaoArquivos() {
        ColecaoArquivos = new ArquivoDigital[MAX_NUMERO_ELEMENTOS];
    }

    public boolean adicionaObra(int posicao, ArquivoDigital midia) {
        if (posicao < MAX_NUMERO_ELEMENTOS && posicao >= 0 && ColecaoArquivos[posicao] == null) {
            ColecaoArquivos[posicao] = midia;
            return true;
        }
        return false;
    }

    public boolean adicionaObra(ArquivoDigital midia) {
        for (int i = 0; i < getColecaoArquivos().length; i++) {
            if (ColecaoArquivos[i] == null) {
                ColecaoArquivos[i] = midia;
                return true;
            }
        }
        return false;
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

}
