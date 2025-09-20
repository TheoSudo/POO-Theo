package Atividade10;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App() {
        super("Carregamento");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton botao = new JButton("Carregar");
        JProgressBar barra = new JProgressBar(0, 100);
        barra.setStringPainted(true);

        add(botao);
        add(barra);

        botao.addActionListener(e -> {
            botao.setEnabled(false);
            barra.setValue(0);   

            Timer timer = new Timer(30, null);
            timer.addActionListener(ev -> {
                int valor = barra.getValue();
                if (valor < 100) {
                    barra.setValue(valor + 1);
                } else {
                    timer.stop(); 
                    JOptionPane.showMessageDialog(null, "Processo concluído!");
                    botao.setEnabled(true);
                }
            });
            timer.start();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
