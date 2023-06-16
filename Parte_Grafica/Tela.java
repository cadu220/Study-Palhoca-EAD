import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

class Tela{
    public static void main(String[] args) {
        //Criação da tela
        JFrame frame = new JFrame("Study Palhoça EAD.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        
        //Seleção do ícone da tela.
        ImageIcon image = new ImageIcon("EAD.png");
        frame.setIconImage(image.getImage());

        //Footer e itens do footer
        JMenuBar menu = new JMenuBar();
        JMenu inserir = new JMenu("Inserir");
        JMenu editar = new JMenu("Editar");
        menu.add(inserir);
        menu.add(editar);
        frame.add(menu);
        JMenuItem cidade = new JMenuItem("Inserir Cidade");
        JMenuItem aluno = new JMenuItem("Inserir Aluno");
        inserir.add(cidade);
        inserir.add(aluno);
        JMenuItem cidade_editar = new JMenuItem("Editar Cidade");
        JMenuItem aluno_editar = new JMenuItem("Editar Aluno");
        editar.add(cidade_editar);
        editar.add(aluno_editar);

        //Posicionamento do footer
        frame.getContentPane().add(BorderLayout.NORTH, menu);

        //Evento para Inserir uma cidade, leva para o arquivo Action.java
        ActionListener handler = new Action();
        cidade.addActionListener(handler);

        frame.setVisible(true);
    }
}

