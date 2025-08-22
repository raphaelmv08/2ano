package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioAluno extends JFrame{
	
	private JLabel lbTitulo;
	private JLabel lbMateria;
	private JTextField txMateria;
	private JLabel lbNota1;
	private JTextField txNota1;
	private JLabel lbNota2;
	private JTextField txNota2;
	private JLabel lbNota3;
	private JTextField txNota3;
	private JLabel lbNota4;
	private JTextField txNota4;
	private JLabel exp;
	private JLabel exp1;
	private JLabel exp2;
	private JLabel exp3;
	private JLabel exp4;
	
	
	private JButton btExibir;
	
	public FormularioAluno() {
		
		setTitle("Calculador de Média de Notas");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(new Color(0, 139, 139)); 

		
		lbTitulo = new JLabel();
		lbTitulo.setText("Calculador de Notas");;
		lbTitulo.setBounds(325,-25,200, 150);
		lbTitulo.setForeground(Color.WHITE);
		add (lbTitulo);
		
		lbMateria = new JLabel();
		lbMateria.setText("Nome da máteria: ");
		lbMateria.setBounds(50, 125, 120, 30);
		lbMateria.setForeground(Color.WHITE);
		
		add (lbMateria);
		
		txMateria = new JTextField();
		txMateria.setBounds(170, 125, 200, 30);
		add (txMateria);
		
		exp = new JLabel();
		exp.setText("<<<----- insira o nome da máteria aqui  ");
		exp.setBounds(400, 125, 250, 30); //x y largura altura
		exp.setForeground(Color.WHITE);
		add (exp);
		
		lbNota1 = new JLabel();
		lbNota1.setText("Nota 1: ");
		lbNota1.setBounds(50, 200, 120, 30);
		lbNota1.setForeground(Color.WHITE);
		add (lbNota1);
		
		txNota1 = new JTextField();
		txNota1.setBounds(170, 200, 200, 30);
		add (txNota1);
		
		exp1 = new JLabel();
		exp1.setText("<<<----- insira a primeira nota aqui  ");
		exp1.setBounds(400, 200, 250, 30); //x y largura altura
		exp1.setForeground(Color.WHITE);
		add (exp1);
		
		lbNota2 = new JLabel();
		lbNota2.setText("Nota 2: ");
		lbNota2.setBounds(50, 275, 120, 30);
		lbNota2.setForeground(Color.WHITE);
		add (lbNota2);
		
		txNota2 = new JTextField();
		txNota2.setBounds(170, 275, 200, 30);
		add (txNota2);
		
		exp2 = new JLabel();
		exp2.setText("<<<----- insira a segunda nota aqui  ");
		exp2.setBounds(400, 275, 250, 30); //x y largura altura
		exp2.setForeground(Color.WHITE);
		add (exp2);
		
		lbNota3 = new JLabel();
		lbNota3.setText("Nota 3: ");
		lbNota3.setBounds(50, 350, 120, 30); 
		lbNota3.setForeground(Color.WHITE);
		add (lbNota3);
		
		txNota3 = new JTextField();
		txNota3.setBounds(170, 350, 200, 30);
		add (txNota3);
		
		exp3 = new JLabel();
		exp3.setText("<<<----- insira a terceira nota aqui  ");
		exp3.setBounds(400, 350, 250, 30); //x y largura altura
		exp3.setForeground(Color.WHITE);
		add (exp3);
		
		lbNota4 = new JLabel();
		lbNota4.setText("Nota 4: ");
		lbNota4.setBounds(50, 425, 120, 30); 
		lbNota4.setForeground(Color.WHITE);
		add (lbNota4);
		
		txNota4 = new JTextField();
		txNota4.setBounds(170, 425, 200, 30);
		add (txNota4);
		
		exp4 = new JLabel();
		exp4.setText("<<<----- insira a quarta nota aqui  ");
		exp4.setBounds(400, 425, 250, 30); //x y largura altura
		exp4.setForeground(Color.WHITE);
		add (exp4);

		btExibir = new JButton();
		btExibir.setBounds(325, 500, 120, 30);
		btExibir.setText("Exibir Média");
		btExibir.setForeground(Color.BLACK);
		btExibir.setBackground(new Color(230, 230, 230));
		btExibir.addActionListener(null);
	    btExibir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String materia = txMateria.getText();
				String n1 = txNota1.getText();
				String n2 = txNota2.getText();
				String n3 = txNota3.getText();
				String n4 = txNota4.getText();
				
				double nota1 = Double.parseDouble(n1);
				double nota2 = Double.parseDouble(n2);
				double nota3 = Double.parseDouble(n3);
				double nota4 = Double.parseDouble(n4);
				
				double m = (nota1+nota2+nota3+nota4)/4;
				JOptionPane.showMessageDialog(null, "Nome da Disciplina: "+materia+ 
						"\nMédia: "+m);
				
			}
		});
		add (btExibir);
		
		setVisible(true);
	}

}
