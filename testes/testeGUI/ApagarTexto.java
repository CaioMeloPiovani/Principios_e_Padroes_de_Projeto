package testeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApagarTexto {
    public static void main(String[] args) {
        JFrame janela = new JFrame("apagar texto");
        janela.setSize(300, 100);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton botaoApagar = new JButton("apagar");
        JTextField campoTexto = new JTextField(10);
        campoTexto.setText("Fala galara");

        JPanel painel = new JPanel();
        painel.add(botaoApagar);
        painel.add(campoTexto);
        janela.getContentPane().add(painel);

        botaoApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("");
            }
        });

        janela.setVisible(true);

    }
}
