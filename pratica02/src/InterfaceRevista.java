import javax.swing.*;
import java.awt.*;

public class InterfaceRevista {
    public InterfaceRevista(){

        JFrame janela = new JFrame("Cadastro Revista");
        janela.setSize(250, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelRevista = new JPanel();
        painelRevista.setLayout(new FlowLayout());

        JLabel tituloRevista = new JLabel("Titulo: ");
        JTextField textoTituloRevista = new JTextField(15);

        JLabel labelOrg = new JLabel("Org: ");
        JTextField textoOrgRevista = new JTextField(15);

        JLabel labelVol = new JLabel("Vol: ");
        JTextField textoVolRevista = new JTextField(3);

        JLabel labelNro = new JLabel("Nro: ");
        JTextField textoNroRevista = new JTextField(3);

        JLabel labelAno = new JLabel("Ano: ");
        JTextField textoAnoRevista = new JTextField(3);



        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.addActionListener(e -> {
            String titulo = textoTituloRevista.getText();
            String org = textoOrgRevista.getText();
            String vol = textoVolRevista.getText();
            String nro = textoNroRevista.getText();
            String ano = textoAnoRevista.getText();


            Material.materiais.add(new CadastroRevista(titulo, ano, org, vol, nro));


            textoTituloRevista.setText("");
            textoOrgRevista.setText("");
            textoVolRevista.setText("");
            textoNroRevista.setText("");
            textoAnoRevista.setText("");
        });



        JButton botaoLivros = new JButton("Voltar");
            botaoLivros.addActionListener(e -> {
                janela.dispose();
                new TelaInicial();
            });

        JButton botaoListagem = new JButton("Listagem");
            botaoListagem.addActionListener(e -> {
                janela.dispose();
                new InterfaceListagem();
            });

//caixa de textos
        painelRevista.add(tituloRevista);
        painelRevista.add(textoTituloRevista);
        painelRevista.add(labelOrg);
        painelRevista.add(textoOrgRevista);
        painelRevista.add(labelVol);
        painelRevista.add(textoVolRevista);
        painelRevista.add(labelNro);
        painelRevista.add(textoNroRevista);
        painelRevista.add(labelAno);
        painelRevista.add(textoAnoRevista);

//Botoes
        painelRevista.add(botaoSalvar);
        painelRevista.add(botaoLivros);
        painelRevista.add(botaoListagem);



        janela.add(painelRevista);
        janela.setVisible(true);
    }
}
