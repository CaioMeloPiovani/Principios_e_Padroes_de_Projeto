import javax.swing.*;
import java.awt.*;

public class InterfaceLivro {
    public InterfaceLivro(){

        JFrame janela = new JFrame("Material Biblioteca");
        janela.setSize(250, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelLivro = new JPanel();
        painelLivro.setLayout(new FlowLayout());


        JLabel labelTitulo = new JLabel("Titulo:");
        JTextField textoTitulo = new JTextField(15);

        JLabel labelAutor = new JLabel("Autor:");
        JTextField textoAutor = new JTextField(15);

        JLabel labelAno = new JLabel("Ano:");
        JTextField textoAno = new JTextField(4);



        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.addActionListener(e -> {
            String titulo = textoTitulo.getText();
            String autor = textoAutor.getText();
            String ano = textoAno.getText();


            Material.materiais.add(new CadastroLivro(titulo, Integer.parseInt(ano), autor));

            textoTitulo.setText("");
            textoAutor.setText("");
            textoAno.setText("");
        });


        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e ->{
            janela.dispose();
            new TelaInicial();
        });

        JButton botaoListagem = new JButton("Listagem");
        botaoListagem.addActionListener(e ->{
            janela.dispose();
            new InterfaceListagem();
        });

        //CAIXAS DE TEXTOS
        painelLivro.add(labelTitulo);
        painelLivro.add(textoTitulo);
        painelLivro.add(labelAutor);
        painelLivro.add(textoAutor);
        painelLivro.add(labelAno);
        painelLivro.add(textoAno);

        //BOTOES
        painelLivro.add(botaoSalvar);
        painelLivro.add(botaoVoltar);
        painelLivro.add(botaoListagem);

        janela.add(painelLivro);
        janela.setVisible(true);
    }
}