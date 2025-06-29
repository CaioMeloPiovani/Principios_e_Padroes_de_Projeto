import javax.swing.*;

public class InterfaceListagem {
    public InterfaceListagem() {
        JFrame janela = new JFrame("Listagem de Materiais");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea areaTexto = new JTextArea(15, 30);
        areaTexto.setEditable(false);


        StringBuilder sb = new StringBuilder();
        sb.append("---- LISTAGEM GERAL DE MATERIAIS ----\n\n");

        if (Material.materiais.isEmpty()) {
            sb.append("VAZIO.");
        } else {
            for (Material material : Material.materiais) {

                sb.append(material.toString()).append("\n---------------------------------\n");
            }
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