package Atividade9;

import javax.swing.*;

public class App extends JFrame {

    public App() {
        super("Exemplo de Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu Arquivo = new JMenu("Arquivo");
        JMenuItem Novo = new JMenuItem("Novo");
        JMenuItem Abrir = new JMenuItem("Abrir");
        JMenuItem Sair = new JMenuItem("Sair");

        Novo.addActionListener(e -> 
        JOptionPane.showMessageDialog(this, "Novo arquivo criado!"));
        Abrir.addActionListener(e -> 
        JOptionPane.showMessageDialog(this, "Abrindo arquivo..."));
        Sair.addActionListener(e -> System.exit(0));

        Arquivo.add(Novo);
        Arquivo.add(Abrir);
        Arquivo.addSeparator();
        Arquivo.add(Sair);

        JMenu Ajuda = new JMenu("Ajuda");
        JMenuItem Sobre = new JMenuItem("Sobre");
        Sobre.addActionListener(e -> 
        JOptionPane.showMessageDialog(this, "Sistema de Menu\nVersão 1.0\nDesenvolvido por Vinicius Neves!"));
        Ajuda.add(Sobre);

        menuBar.add(Arquivo);
        menuBar.add(Ajuda);

        setJMenuBar(menuBar);

        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
