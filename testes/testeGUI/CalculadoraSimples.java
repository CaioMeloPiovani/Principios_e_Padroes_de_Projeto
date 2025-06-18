import javax.swing.*;
import java.awt.event.*;

public class CalculadoraSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField resultado = new JTextField();
        resultado.setEditable(false);

        JButton somar = new JButton("+");
        JButton subtrair = new JButton("-");
        JButton multiplicar = new JButton("*");
        JButton dividir = new JButton("/");

        t1.setBounds(50, 50, 150, 20);
        t2.setBounds(50, 80, 150, 20);
        resultado.setBounds(50, 110, 150, 20);

        somar.setBounds(50, 150, 50, 50);
        subtrair.setBounds(110, 150, 50, 50);
        multiplicar.setBounds(50, 210, 50, 50);
        dividir.setBounds(110, 210, 50, 50);

        somar.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            resultado.setText(String.valueOf(n1 + n2));
        });

        subtrair.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            resultado.setText(String.valueOf(n1 - n2));
        });

        multiplicar.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            resultado.setText(String.valueOf(n1 * n2));
        });

        dividir.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n2 != 0) {
                resultado.setText(String.valueOf((double)n1 / n2));
            } else {
                resultado.setText("Erro");
            }
        });

        frame.add(t1);
        frame.add(t2);
        frame.add(resultado);
        frame.add(somar);
        frame.add(subtrair);
        frame.add(multiplicar);
        frame.add(dividir);

        frame.setSize(270, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
