package testeGUI;

import javax.swing.*;
import java.awt.*;

public class LoginPainel {
    public static void main(String[] args) {
        JFrame janela = new JFrame("LOGIN");
        janela.setSize(250, 100);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(new GridLayout(3, 2, 5, 5));

        //criar os JLabel que serao o que cada campo significa
        JLabel labelUsuario = new JLabel("usuario: ");
        JLabel labelSenha = new JLabel("senha: ");

        //criar o text field
        JTextField textoUsuario = new JTextField();
        JTextField textoSenha = new JTextField();

        JButton botaoLogin = new JButton("Logar");

        painelLogin.add(labelUsuario);
        painelLogin.add(textoUsuario);

        painelLogin.add(labelSenha);
        painelLogin.add(textoSenha);

        painelLogin.add(botaoLogin);

        janela.add(painelLogin);
        janela.setVisible(true);




    }
}
