import javax.swing.*;

public class App {
    public static void main(String[] args){
    JFrame frame = new JFrame("Bem-vindo ao Swing");
    
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    JLabel label = new JLabel("Olá, mundo gráfico!");
    label.setVisible(true);
    frame.add(label);
    }
}
