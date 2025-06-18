package testeGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela {
    public static void main(String[] args) {


        JFrame janela = new JFrame("botao + limpar");
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton botao = new JButton("clicar");
        botao.setBounds(100, 50, 100, 30);


        JTextField texto = new JTextField();
        texto.setBounds(50, 100, 200, 30);
        texto.setText("CLIQUE NO BOTAO");
        texto.setHorizontalAlignment(JTextField.CENTER);


        janela.add(botao);
        janela.add(texto);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
            }
        });

        janela.setVisible(true);
    }        //janela.setVisible(true);

}

