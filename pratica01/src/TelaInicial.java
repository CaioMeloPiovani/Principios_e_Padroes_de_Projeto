import javax.swing.*;
import java.awt.*;

public class TelaInicial {
    public TelaInicial() {
        JFrame janela = new JFrame("Controle Biblioteca");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setLayout(new GridLayout(3, 1));

        JButton botaoLivro = new JButton("Livro");
        botaoLivro.addActionListener(e ->{
                janela.dispose();
            new CadastroLivro();
        });

        JButton botaoRevista = new JButton("Revista");
        botaoRevista.addActionListener(e ->{
            janela.dispose();
            new CadastroRevista();
        });

        JButton close = new JButton("Fechar programa");
        close.addActionListener(e ->{
            janela.dispose();
        });


        janela.add(botaoLivro);
        janela.add(botaoRevista);
        janela.add(close);

        janela.setVisible(true);
        }
    }

