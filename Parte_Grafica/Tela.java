import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Tela extends JFrame{
    public static void main(String[] args) {
        //Criação da tela
        JFrame frame = new JFrame("Study Palhoça EAD.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        
        //Seleção do ícone da tela.
        ImageIcon image = new ImageIcon("EAD.png");
        frame.setIconImage(image.getImage());

        //Header e itens do header
        JMenuBar header = new JMenuBar();
        JMenu inserir = new JMenu("Inserir");
        JMenu editar = new JMenu("Editar");
        header.add(inserir);
        header.add(editar);
        frame.add(header);
        JMenuItem cidade = new JMenuItem("Inserir Cidade");
        JMenuItem aluno = new JMenuItem("Inserir Estudante");
        inserir.add(cidade);
        inserir.add(aluno);
        JMenuItem cidade_editar = new JMenuItem("Editar Cidade");
        JMenuItem aluno_editar = new JMenuItem("Editar Estudante");
        editar.add(cidade_editar);
        editar.add(aluno_editar);

        //Footer e itens do footer  
        JMenuBar footer = new JMenuBar();
        JLabel pesquisaTexto = new JLabel("Nome da ");
        JButton pesquisaSeleciona = new JButton("Cidade");
        
        /* Troca o texto do Texto ao lado do botão e do botão, vai servir para escolher se queremos procurar
        um Aluno ou uma Cidade */
        pesquisaSeleciona.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               if (pesquisaTexto.getText().equals("Nome da ")){
                    pesquisaTexto.setText("Nome do ");
                    pesquisaSeleciona.setText("Estudante");
               }
               else{
                    pesquisaTexto.setText("Nome da ");
                    pesquisaSeleciona.setText("Cidade");
               }
            }
        });
        
        //Ainda é os itens do footer
        footer.add(pesquisaTexto);
        footer.add(pesquisaSeleciona);
        JTextField barraPesquisa = new JTextField(20);
        JButton pesquisaButton = new JButton("Pesquisar");
        footer.add(barraPesquisa);
        footer.add(pesquisaButton);

        //Posicionamento do header e footer
        frame.getContentPane().add(BorderLayout.NORTH, header);
        frame.getContentPane().add(BorderLayout.SOUTH, footer);

        //Evento para Inserir uma cidade, leva para o arquivo CriarCidade.java
        ActionListener handler_cidade = new CriarCidade();
        cidade.addActionListener(handler_cidade);

        //Evento para Inserir um aluno, leva para CriarEstudante.java
        ActionListener handler_estudante = new CriarEstudante();
        aluno.addActionListener(handler_estudante);

        //Deixa a tela vísivel  
        frame.setVisible(true);
    }
}

