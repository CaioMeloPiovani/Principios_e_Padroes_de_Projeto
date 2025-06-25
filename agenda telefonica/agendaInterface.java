import javax.swing.*;
import java.awt.*;

class agendaInterface {
     public agendaInterface(){

         JFrame janela = new JFrame("Agenda Telefonica");
         janela.setSize(400, 250);
         janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         janela.setLayout(new BorderLayout(15, 10));


         JLabel titulo = new JLabel("INSIRA OS DADOS", SwingConstants.CENTER);
         titulo.setFont(new Font("arial", Font.BOLD, 20));
         janela.add(titulo, BorderLayout.NORTH);

         JPanel paineltextos = new JPanel();
         paineltextos.setLayout(new GridLayout(3 , 2, 10, 10));
         paineltextos.setBorder(BorderFactory.createEmptyBorder(20,20, 20, 20));
         paineltextos.setBackground(Color.lightGray);

         JLabel labelnome = new JLabel("NOME");
         JTextField textonome = new JTextField();



         JLabel labeltelefone = new JLabel("Telefone");
         JTextField texttelefone = new JTextField(10);

         JLabel labelemail = new JLabel("E-mail");
         JTextField textemail = new JTextField(10);


         JPanel painelbotoes = new JPanel(new GridLayout(1, 3, 10, 10));
         painelbotoes.setBackground(Color.lightGray);

         JButton botaoSalvar = new JButton("SALVAR");
            botaoSalvar.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
                String nome = textonome.getText();
                String telefone = texttelefone.getText();
                String email = textemail.getText();
                AgendaDados.agenda.add(new AgendaDados(nome, telefone, email));
                textonome.setText("");
                texttelefone.setText("");
                textemail.setText("");

            });


         JButton botaoLimpar = new JButton("LIMPAR");
            botaoLimpar.addActionListener(e -> {
             // JOptionPane.showMessageDialog(null, "Dados apagados com sucesso!");
                 textonome.setText("");
                texttelefone.setText("");
                 textemail.setText("");
         });

         JButton botaoRegistros = new JButton("REGISTROS");
            botaoRegistros.addActionListener(e -> {
                new RegistrosInterface();
            });





         paineltextos.add(labelnome);
         paineltextos.add(textonome);

         paineltextos.add(labeltelefone);
         paineltextos.add(texttelefone);

         paineltextos.add(labelemail);
         paineltextos.add(textemail);

         painelbotoes.add(botaoSalvar);
         painelbotoes.add(botaoLimpar);
         painelbotoes.add(botaoRegistros);

         janela.add(paineltextos, BorderLayout.CENTER);
         janela.add(painelbotoes, BorderLayout.SOUTH);
         janela.setVisible(true);
     }
}


