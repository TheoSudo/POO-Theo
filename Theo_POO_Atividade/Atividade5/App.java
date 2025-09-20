package Atividade5;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("Cursos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JRadioButton info = new JRadioButton("Curso de Informática");
        JRadioButton eletro = new JRadioButton("Curso de Eletrônica");
        JRadioButton adm = new JRadioButton("Curso de Administração");

        ButtonGroup selecao = new ButtonGroup();
        selecao.add(info);
        selecao.add(eletro);
        selecao.add(adm);

        JButton botao = new JButton("Confirmar!");
        botao.setSize(150, 50);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String curso1 = info.getText();
                String curso2 = eletro.getText();
                String curso3 = adm.getText();

                if (info.isSelected()){
                    JOptionPane.showMessageDialog(frame, "O curso escolhido foi: " + curso1 + "!");
                }

                if (eletro.isSelected()){
                    JOptionPane.showMessageDialog(frame, "O curso escolhido foi: " + curso2 + "!");
                }

                if (adm.isSelected()){
                    JOptionPane.showMessageDialog(frame, "O curso escolhido foi: " + curso3 + "!");
                }
            }
        });

        frame.add(info);
        frame.add(eletro);
        frame.add(adm);

        frame.add(botao);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}