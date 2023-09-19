public class ColecaoArquivos {

    /*
    * Adiciona arquivo na posicao desejada [OK]
    * Adiciona arquivo na primeira posição vaga [OK]
    * Consulta posição retornando a posição ou -1 (caso inválido) [OK]
    * Remover contato pela posição [ ]
    *
    * */

    private ArquivoDigital[] ColecaoArquivos;
    private final int MAX_NUMERO_ELEMENTOS = 10;
    private int numeroDeElementos;
    private final int POSICAO_INVALIDA = -1;

    public ColecaoArquivos() {
        ColecaoArquivos = new ArquivoDigital[MAX_NUMERO_ELEMENTOS];
        numeroDeElementos = 0;
    }

    public boolean adicionaObra(int posicao, ArquivoDigital midia) {
        if (posicao < MAX_NUMERO_ELEMENTOS && posicao >= 0 && ColecaoArquivos[posicao] == null) {
            ColecaoArquivos[posicao] = midia;
            numeroDeElementos++;
            return true;
        }
        return false;
    }

    public boolean adicionaObra(ArquivoDigital midia) {
        if(numeroDeElementos <= ColecaoArquivos.length){
            for (int i = 0; i < getColecaoArquivos().length; i++) {
                if (ColecaoArquivos[i] == null) {
                    ColecaoArquivos[i] = midia;
                    return true;
                }
            }
        }
        return false;
    }



    public int consultaPosicao(int posicao) {
        if (posicao < 0 || posicao >= MAX_NUMERO_ELEMENTOS || ColecaoArquivos[posicao] == null) {
            return POSICAO_INVALIDA;
        } else {
            return posicao;
        }
    }

    public int consultaPosicao (ArquivoDigital arquivoDigital){
        for (int i = 0; i < ColecaoArquivos.length; i++){

            if (ColecaoArquivos[i] != null && ColecaoArquivos[i].equals(arquivoDigital)){
                return i;
            }
        }
        return POSICAO_INVALIDA;
    }

    public ArquivoDigital[] getColecaoArquivos() {
        return ColecaoArquivos;
    }

}
