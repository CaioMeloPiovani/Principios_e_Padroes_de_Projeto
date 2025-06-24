public class CadastroLivro {
    private String titulo;
    private String autor;
    private String ano;

    public CadastroLivro(String titulo, String autor, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String toString() {
        return "Livro - " + titulo + ", " + autor + ", " + ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
