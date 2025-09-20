package Atividade7;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3, 2));

        JTextField num1 = new JTextField(20);
        frame.add(num1);

        JTextField num2 = new JTextField(20);
        frame.add(num2);

        JLabel resultado = new JLabel();

        JButton soma = new JButton("Somar");
        soma.setSize(150, 50);
        soma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Integer soma = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
                resultado.setText("Resultado: " + soma);
            }
        });

        JButton sub = new JButton("Subtrair");
        sub.setSize(150, 50);
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Integer sub = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
                resultado.setText("Resultado: " + sub);
            }
        });

        frame.add(num1);
        frame.add(num2);
        
        frame.add(soma);
        frame.add(sub);
        frame.add(resultado);

        resultado.setVisible(true);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    }
}
      

