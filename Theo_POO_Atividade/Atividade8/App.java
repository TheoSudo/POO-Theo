package Atividade8;

import java.awt.*;
import javax.swing.*;

public class App extends JFrame {

    public App() {
        super("Formulário com JTabbedPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel painel1 = new JPanel(new FlowLayout());
        painel1.add(new JLabel("Nome:"));
        JTextField nome = new JTextField(15);
        painel1.add(nome);

        painel1.add(new JLabel("Idade:"));
        JTextField idade = new JTextField(5);
        painel1.add(idade);

        JPanel painel2 = new JPanel(new FlowLayout());
        painel2.add(new JLabel("Rua:"));
        JTextField rua = new JTextField(15);
        painel2.add(rua);

        painel2.add(new JLabel("Cidade:"));
        JTextField cidade = new JTextField(10);
        painel2.add(cidade);

        JPanel painel3 = new JPanel(new BorderLayout());
        JTextArea resumo = new JTextArea(8, 30);
        resumo.setEditable(false);
        resumo.setLineWrap(true);
        resumo.setWrapStyleWord(true);
        painel3.add(resumo);

        JButton botao1 = new JButton("Confirmar Dados");
        botao1.addActionListener(e -> {
            resumo.setText("\nNome: " + nome.getText() + "\nIdade: " + idade.getText());
        });
        painel1.add(botao1);

        JButton botao2 = new JButton("Confirmar Endereço");
        botao2.addActionListener(e -> {
            String antigo = resumo.getText();
            resumo.setText(antigo + "\nRua: " + rua.getText() + "\nCidade: " + cidade.getText());
        });
        painel2.add(botao2);

        tabbedPane.addTab("Dados Pessoais", painel1);
        tabbedPane.addTab("Endereço", painel2);
        tabbedPane.addTab("Resumo", painel3);

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
