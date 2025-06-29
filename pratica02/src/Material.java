import java.util.ArrayList;

public class Material {
    private String titulo;
    private int ano;

    public static ArrayList<Material> materiais = new ArrayList<>();

    public Material(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String toString() {
        return "Título: " + titulo + ", Ano: " + ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}