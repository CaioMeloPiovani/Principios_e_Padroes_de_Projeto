public class CadastroRevista {
    private String titulo;
    private String org;
    private String vol;
    private String nro;
    private String ano;

    public CadastroRevista(String titulo, String org, String vol, String nro, String ano) {
        this.titulo = titulo;
        this.org = org;
        this.vol = vol;
        this.nro = nro;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Revista - " + titulo + ", " + org + ", " +  vol + ", " + nro;
    }
}

