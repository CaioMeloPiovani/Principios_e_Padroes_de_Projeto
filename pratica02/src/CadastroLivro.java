public class CadastroLivro extends Material {
    private String autor;

    public CadastroLivro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public String toString() {
        return "Livro - " + super.toString() + ", Autor: " + autor;
    }
}
