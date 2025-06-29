public class CadastroVideo extends Material {
    private String duracao;

    public CadastroVideo(String titulo, String ano, String duracao) {
        super(titulo, Integer.parseInt(ano));
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Video - " + getTitulo() + ", Ano: " + getAno() + ", Duracao: " + duracao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
