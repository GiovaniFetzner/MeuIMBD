public class ArquivoDigital {

    private int codigo, ano;
    private String nome, diretor, principaisAtores;
    private Categoria categoria;
    private Genero genero;
    public ArquivoDigital(int codigo, int ano, String nome, String diretor, String principaisAtores,
                          Categoria categoria, Genero genero) {
        this.codigo = codigo;
        this.ano = ano;
        this.nome = nome;
        this.diretor = diretor;
        this.principaisAtores = principaisAtores;
        this.categoria = categoria;
    }

    public String informacoes() {
        return "Nome:" + nome + ", Categoria:" + categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPrincipaisAtores() {
        return principaisAtores;
    }

    public void setPrincipaisAtores(String principaisAtores) {
        this.principaisAtores = principaisAtores;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

}
