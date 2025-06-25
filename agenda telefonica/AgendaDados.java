import java.util.ArrayList;

public class AgendaDados {
    private String nome;
    private String telefone;
    private String email;
    public static ArrayList<AgendaDados> agenda = new ArrayList<AgendaDados>();

    public AgendaDados(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;

    }

    @Override
    public String toString(){
        return nome + " | " + telefone + " - " + email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
