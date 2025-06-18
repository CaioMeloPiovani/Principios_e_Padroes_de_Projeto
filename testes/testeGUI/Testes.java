package testeGUI;

import javax.swing.*;

public class Testes {
    public static void main(String[] args) {
        JFrame janelateste = new JFrame();
        janelateste.setSize(500, 500);
        janelateste.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel texto = new JLabel("Ola macaco", SwingConstants.CENTER);
        janelateste.add(texto);


        janelateste.setVisible(true);
    }
}