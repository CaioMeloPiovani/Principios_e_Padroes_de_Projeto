import javax.swing.*;
import java.awt.*;

public class TelaInicial {
    public TelaInicial() {
        JFrame janela = new JFrame("Controle Biblioteca");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JPanel painelMenu = new JPanel();
        painelMenu.setLayout(new GridLayout(3, 2));
        painelMenu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        painelMenu.setBackground(Color.lightGray);

        JLabel titulo = new JLabel("Controle Biblioteca", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.BLACK);
        janela.add(titulo);

        JButton botaoLivro = new JButton("Livro");
        botaoLivro.addActionListener(e ->{
                janela.dispose();
            new InterfaceLivro();
        });

        JButton botaoRevista = new JButton("Revista");
        botaoRevista.addActionListener(e ->{
            janela.dispose();
            new InterfaceRevista();
        });

            JButton botaoVideo = new JButton("Videos");
        botaoVideo.addActionListener(e ->{
           janela.dispose();
           new InterfaceVideo();
        });

        JButton botaoListagem = new JButton("Listagem");
        botaoListagem.addActionListener(e ->{
           janela.dispose();
           new InterfaceListagem();
        });

        JButton close = new JButton("Fechar programa");
        close.addActionListener(e ->{
            janela.dispose();
        });


        painelMenu.add(botaoLivro);
        painelMenu.add(botaoRevista);
        painelMenu.add(botaoVideo);
        painelMenu.add(botaoListagem);
        painelMenu.add(close);

        janela.add(painelMenu);
        janela.setVisible(true);
        }
    }

