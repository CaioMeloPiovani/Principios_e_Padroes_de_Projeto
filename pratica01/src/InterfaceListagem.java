import javax.swing.*;
import java.awt.*;

public class InterfaceListagem {
    public InterfaceListagem() {
        JFrame janela = new JFrame("Listagem");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea areaTexto = new JTextArea(15, 30);
        areaTexto.setEditable(false);

        StringBuilder sb = new StringBuilder();

        sb.append("---- LIVROS ----\n");
        for (CadastroLivro l : Listagem.livros) {
            sb.append(l.toString()).append("\n");
        }

        sb.append("\n---- REVISTAS ----\n");
        for (CadastroRevista r : Listagem.revistas) {
            sb.append(r.toString()).append("\n");
        }

        areaTexto.setText(sb.toString());

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e -> {
            janela.dispose();
            new TelaInicial();
        });

        JPanel painel = new JPanel();
        painel.add(new JScrollPane(areaTexto));
        painel.add(botaoVoltar);

        janela.add(painel);
        janela.setVisible(true);
    }
}
