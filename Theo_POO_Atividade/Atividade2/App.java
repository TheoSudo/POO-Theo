import javax.swing.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("JButton");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton botao = new JButton("Clique Aqui!!");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Botão Clicado", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(botao);
        frame.setVisible(true);
    }
}
