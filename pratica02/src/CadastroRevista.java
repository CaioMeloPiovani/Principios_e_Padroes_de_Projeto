public class CadastroRevista extends Material {
    private String org;
    private String vol;
    private String nro;

    public CadastroRevista(String titulo, String ano, String org, String vol, String nro) {
        super(titulo, Integer.parseInt(ano));
        this.org = org;
        this.vol = vol;
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Revista - " + getTitulo() + ", " + org + ", Vol. " + vol + ", Nº " + nro + ", Ano: " + getAno();
    }
}
