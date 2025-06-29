import javax.swing.*;
import java.awt.*;

public class InterfaceVideo {
    public InterfaceVideo() {
        JFrame janela = new JFrame("Cadastro Video");
        janela.setSize(300, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tituloJanela = new JLabel("Cadastro Video", SwingConstants.CENTER);
        tituloJanela.setFont(new Font("Arial", Font.BOLD, 20));
        janela.add(tituloJanela, BorderLayout.NORTH);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBackground(Color.LIGHT_GRAY);


        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel labelTitulo = new JLabel("Título:");
        JTextField textotitulo = new JTextField(15);
        linha1.add(labelTitulo);
        linha1.add(textotitulo);


        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel labelAno = new JLabel("Ano:");
        JTextField textoano = new JTextField(15);
        linha2.add(labelAno);
        linha2.add(textoano);


        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel labelDuracao = new JLabel("Duração:");
        JTextField textoduracao = new JTextField(15);
        linha3.add(labelDuracao);
        linha3.add(textoduracao);


        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botaoListagem = new JButton("Listagem");
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoVoltar = new JButton("Voltar");

        botoes.add(botaoListagem);
        botoes.add(botaoSalvar);
        botoes.add(botaoVoltar);


        botaoSalvar.addActionListener(e -> {
            String titulo = textotitulo.getText();
            String ano = textoano.getText();
            String duracao = textoduracao.getText();


            Material.materiais.add(new CadastroVideo(titulo, ano, duracao));


            textotitulo.setText("");
            textoano.setText("");
            textoduracao.setText("");
        });

        botaoVoltar.addActionListener(e -> {
            janela.dispose();
            new TelaInicial();
        });

        botaoListagem.addActionListener(e -> {
           janela.dispose();
           new InterfaceListagem();
        });

        painelPrincipal.add(linha1);
        painelPrincipal.add(linha2);
        painelPrincipal.add(linha3);
        painelPrincipal.add(botoes);

        janela.add(painelPrincipal, BorderLayout.CENTER);
        janela.setVisible(true);
    }
}
