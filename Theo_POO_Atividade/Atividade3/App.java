import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());

        JTextField campoTexto = new JTextField(20);
        frame.add(campoTexto);

        JButton botao = new JButton("Confirmar!");
        botao.setSize(150, 50);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nome = campoTexto.getText();
                JOptionPane.showMessageDialog(frame, "Olá, " + nome + "!");
            }
        });

        frame.add(botao);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
