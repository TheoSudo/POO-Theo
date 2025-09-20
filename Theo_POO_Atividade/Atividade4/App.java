package Atividade4;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("Selecao");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JCheckBox ler = new JCheckBox("Ler");
        JCheckBox esportes = new JCheckBox("Esportes");
        JCheckBox musica = new JCheckBox("Musica");

        JButton botao = new JButton("Mostrar Selecao");
        botao.setSize(150, 50);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "Seus Hobies são: ", "Informação", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Minha Seleção: ");
                if (ler.isSelected()){
                    JOptionPane.showMessageDialog(frame, "Ler", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
                if (esportes.isSelected()){
                    JOptionPane.showMessageDialog(frame, "Esportes", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
                if (musica.isSelected()){
                    JOptionPane.showMessageDialog(frame, "Musica", "Informação", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(ler);
        frame.add(esportes);
        frame.add(musica);

        frame.add(botao);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
