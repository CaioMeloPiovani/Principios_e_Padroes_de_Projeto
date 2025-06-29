public class CadastroVideo {
    private String titulo;
    private String ano;
    private String duracao;

    public CadastroVideo(String titulo, String ano, String duracao) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Revista - " + titulo + ", " + ano + ", " + duracao;
    }

    public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
