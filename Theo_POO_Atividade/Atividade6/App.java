package Atividade6;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JTextField usuario = new JTextField(20);
        frame.add(usuario);

        JPasswordField senha = new JPasswordField(20);
        frame.add(senha);

        JButton botao = new JButton("Entrar");
        botao.setSize(150, 50);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String login = usuario.getText();
                String Senha = new String(senha.getPassword());

                if(Senha.equals("1234") && login.equals("admin")){
                    JOptionPane.showMessageDialog(frame, "Login realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário ou senha incorretos");
                }
            }
        });

        frame.add(botao);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
