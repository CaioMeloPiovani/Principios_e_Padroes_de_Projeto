import javax.swing.*;
import java.awt.*;

public class CadastroRevista {
    public CadastroRevista(){

        JFrame janela = new JFrame("Cadastro Revista");
        janela.setSize(250, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelRevista = new JPanel();
        painelRevista.setLayout(new FlowLayout());

        JLabel tituloRevista = new JLabel("Titulo: ");
        JTextField textoTituloRevista = new JTextField(15);

        JLabel org = new JLabel("Org: ");
        JTextField textoOrgRevista = new JTextField(15);

        JLabel vol = new JLabel("Vol: ");
        JTextField textoVolRevista = new JTextField(3);

        JLabel nro = new JLabel("Nro: ");
        JTextField textoNroRevista = new JTextField(3);

        JLabel ano = new JLabel("Ano: ");
        JTextField textoAnoRevista = new JTextField(3);

        JButton botaoSalvar = new JButton("incluir");

        JButton botaoLivros = new JButton("Livros");
            botaoLivros.addActionListener(e -> {
                janela.dispose();
                new CadastroLivro();
            });

        JButton botaoListagem = new JButton("Listagem");

//caixa de textos
        painelRevista.add(tituloRevista);
        painelRevista.add(textoTituloRevista);
        painelRevista.add(org);
        painelRevista.add(textoOrgRevista);
        painelRevista.add(vol);
        painelRevista.add(textoVolRevista);
        painelRevista.add(nro);
        painelRevista.add(textoNroRevista);
        painelRevista.add(ano);
        painelRevista.add(textoAnoRevista);

//Botoes
        painelRevista.add(botaoSalvar);
        painelRevista.add(botaoLivros);
        painelRevista.add(botaoListagem);



        janela.add(painelRevista);
        janela.setVisible(true);
    }
}
