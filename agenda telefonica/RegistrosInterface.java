import javax.swing.*;
import java.awt.*;

public class RegistrosInterface {
    public RegistrosInterface() {
        JFrame janela = new JFrame("Registros");
        janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout(15, 10));

        JLabel titulo = new JLabel("REGISTROS", JLabel.CENTER);
        titulo.setFont(new Font("arial", Font.BOLD, 15));
        janela.add(titulo, BorderLayout.NORTH);

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        StringBuilder sb = new StringBuilder();

        for(AgendaDados contato : AgendaDados.agenda ) {
            sb.append(contato.toString()).append("\n");
        }
        areaTexto.setText(sb.toString());

        JScrollPane scroll = new JScrollPane(areaTexto);
        janela.add(scroll, BorderLayout.CENTER);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e -> {
            janela.dispose();
            new agendaInterface();
        });


        janela.add(areaTexto, BorderLayout.NORTH);
        janela.add(botaoVoltar, BorderLayout.SOUTH);
        janela.setVisible(true);
    }
}
