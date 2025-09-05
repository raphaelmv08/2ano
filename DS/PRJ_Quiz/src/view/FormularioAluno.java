
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FormularioAluno extends JFrame {

	private JLabel lbNome, lbPerg1, lbPerg2, lbPerg3, lbPerg4, lbPerg5;
	private JButton btExibir;

	// RadioButtons para período
	private JRadioButton rbMarte, rbJupiter, rbVenus, rbSaturno, rbMercurio, rbChi, rbJp, rbInd, rbCdS, rbTai;
	private ButtonGroup bgPerg1, bgPerg5;

	// ComboBox para curso
	private JComboBox<String> cbPerg2, cbPerg4;

	// CheckBoxes para matérias
	private JCheckBox cbCopa1, cbCopa2, cbCopa3, cbCopa4, cbCopa5;

	public FormularioAluno() {

		// Configurações da janela
		setTitle("Quiz");
		setSize(1200, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		// setResizable (false);
		setLayout(null);
		getContentPane().setBackground(new Color(30, 30, 46));

		// Label e TextField para nome
		lbNome = new JLabel("QUIZ COM 5 PERGUNTAS: ");
		lbNome.setBounds(525, 30, 160, 30);
		lbNome.setForeground(new Color(255, 255, 255));
		add(lbNome);

		// Label para período
		lbPerg1 = new JLabel("Qual é o maior planeta do Sistema Solar?");
		lbPerg1.setBounds(475, 100, 250, 30);
		lbPerg1.setForeground(Color.WHITE);
		add(lbPerg1);

		// RadioButtons para período
		rbMarte = new JRadioButton("Marte");
		rbMarte.setBounds(330, 160, 100, 30);
		rbMarte.setBackground(new Color ( 46, 46, 62));
		rbMarte.setForeground(Color.WHITE);
		add(rbMarte);

		rbJupiter = new JRadioButton("Jupíter");
		rbJupiter.setBounds(440, 160, 100, 30);
		rbJupiter.setBackground(new Color ( 46, 46, 62));
		rbJupiter.setForeground(Color.WHITE);
		add(rbJupiter);

		rbVenus = new JRadioButton("Vênus");
		rbVenus.setBounds(550, 160, 100, 30);
		rbVenus.setBackground(new Color ( 46, 46, 62));
		rbVenus.setForeground(Color.WHITE);
		add(rbVenus);

		rbSaturno = new JRadioButton("Saturno");
		rbSaturno.setBounds(660, 160, 100, 30);
		rbSaturno.setBackground(new Color ( 46, 46, 62));
		rbSaturno.setForeground(Color.WHITE);
		add(rbSaturno);

		rbMercurio = new JRadioButton("Mercúrio");
		rbMercurio.setBounds(770, 160, 100, 30);
		rbMercurio.setBackground(new Color ( 46, 46, 62));
		rbMercurio.setForeground(Color.WHITE);
		add(rbMercurio);

		// Agrupando RadioButtons
		bgPerg5 = new ButtonGroup();
		bgPerg5.add(rbChi);
		bgPerg5.add(rbJp);
		bgPerg5.add(rbInd);
		bgPerg5.add(rbCdS);
		bgPerg5.add(rbTai);

		// Label para curso
		lbPerg2 = new JLabel("Em que continente fica o Brasil?");
		lbPerg2.setBounds(503, 220, 200, 30);
		lbPerg2.setForeground(Color.WHITE);
		add(lbPerg2);

		// ComboBox para curso
		String[] continentes = { "Selecione o Continente", "America do Sul", "Oceania", "Europa", "Asia", "Africa" };
		cbPerg2 = new JComboBox<>(continentes);
		cbPerg2.setBounds(513, 260, 170, 30);
		cbPerg2.setBackground(new Color ( 76, 76, 92));
		cbPerg2.setForeground(Color.WHITE);
		add(cbPerg2);

		// Label para matérias
		lbPerg3 = new JLabel("Em que anos aconteceram as primeiras duas Copas do Mundo?");
		lbPerg3.setBounds(413, 325, 400, 30);
		lbPerg3.setForeground(Color.WHITE);
		add(lbPerg3);

		lbPerg4 = new JLabel("Quem pintou a Monalisa?");
		lbPerg4.setBounds(523, 495, 160, 30);
		lbPerg4.setForeground(Color.WHITE);
		add(lbPerg4);

		cbCopa1 = new JCheckBox("1930");
		cbCopa1.setBounds(475, 365, 100, 30);
		cbCopa1.setBackground(new Color ( 46, 46, 62));
		cbCopa1.setForeground(Color.WHITE);
		add(cbCopa1);

		cbCopa2 = new JCheckBox("1934");
		cbCopa2.setBounds(630, 365, 100, 30);
		cbCopa2.setBackground(new Color ( 46, 46, 62));
		cbCopa2.setForeground(Color.WHITE);
		add(cbCopa2);

		cbCopa3 = new JCheckBox("1938");
		cbCopa3.setBounds(475, 405, 100, 30);
		cbCopa3.setBackground(new Color ( 46, 46, 62));
		cbCopa3.setForeground(Color.WHITE);
		add(cbCopa3);

		cbCopa4 = new JCheckBox("1942");
		cbCopa4.setBounds(630, 405, 100, 30);
		cbCopa4.setBackground(new Color ( 46, 46, 62));
		cbCopa4.setForeground(Color.WHITE);
		add(cbCopa4);

		cbCopa5 = new JCheckBox("1946");
		cbCopa5.setBounds(555, 455, 100, 30);
		cbCopa5.setBackground(new Color ( 46, 46, 62));
		cbCopa5.setForeground(Color.WHITE);
		add(cbCopa5);

		String[] artistas = { "Selecione um Artista", "Michelangelo", "Pablo Picasso", "Leonardo da Vinci", "Vincent Van Gogh","Salvador Dalí" };
		cbPerg4 = new JComboBox<>(artistas);
		cbPerg4.setBounds(513, 555, 170, 30);
		cbPerg4.setBackground(new Color ( 76, 76, 92));
		cbPerg4.setForeground(Color.WHITE);
		add(cbPerg4);

		lbPerg5 = new JLabel("Qual é o país conhecido como: A Terra do Sol Nascente?");
		lbPerg5.setBounds(425, 625, 350, 30);
		lbPerg5.setForeground(Color.WHITE);
		add(lbPerg5);

		rbChi = new JRadioButton("China");
		rbChi.setBounds(340, 670, 100, 30);
		rbChi.setBackground(new Color ( 46, 46, 62));
		rbChi.setForeground(Color.WHITE);
		add(rbChi);

		rbJp = new JRadioButton("Japão");
		rbJp.setBounds(450, 670, 100, 30);
		rbJp.setBackground(new Color ( 46, 46, 62));
		rbJp.setForeground(Color.WHITE);
		add(rbJp);

		rbInd = new JRadioButton("Índia");
		rbInd.setBounds(560, 670, 100, 30);
		rbInd.setBackground(new Color ( 46, 46, 62));
		rbInd.setForeground(Color.WHITE);
		add(rbInd);

		rbCdS = new JRadioButton("Coreia do Sul");
		rbCdS.setBounds(670, 670, 120, 30);
		rbCdS.setBackground(new Color ( 46, 46, 62));
		rbCdS.setForeground(Color.WHITE);	
		add(rbCdS);

		rbTai = new JRadioButton("Tailândia");
		rbTai.setBounds(800, 670, 100, 30);
		rbTai.setBackground(new Color ( 46, 46, 62));
		rbTai.setForeground(Color.WHITE);
		
		add(rbTai);

		// Agrupando RadioButtons
		bgPerg1 = new ButtonGroup();
		bgPerg1.add(rbMarte);
		bgPerg1.add(rbJupiter);
		bgPerg1.add(rbVenus);
		bgPerg1.add(rbSaturno);
		bgPerg1.add(rbMercurio);

		// Botão para exibir dados
		btExibir = new JButton("Exibir Dados");
		btExibir.setBounds(523, 750, 150, 30);
		btExibir.setForeground(Color.WHITE);
		btExibir.setBackground(new Color(76, 175, 80));
		add(btExibir);

		// Evento do botão
		btExibir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// Verifica período selecionado
				String resp = "";
				int pontos = 0;
				if (rbMarte.isSelected()) {
					resp = "Resposta errada";

				} else if (rbJupiter.isSelected()) {
					resp = "Resposta Certa!";
					pontos++;

				} else if (rbVenus.isSelected()) {
					resp = "Resposta errada";

				} else if (rbSaturno.isSelected()) {
					resp = "Resposta errada";

				} else if (rbMercurio.isSelected()) {
					resp = "Resposta errada";
				} else {
					resp = "Questão não respondida";
				}

				// Verifica curso selecionado
				String cont = (String) cbPerg2.getSelectedItem();
				
				if (cont.equals("America do Sul")) {
					cont = "Resposta Certa!: America do Sul";
					pontos++;
				} else if (cont.equals("Oceania")){
					cont = "Resposta Errada!: A certa era America do Sul";
				} else if (cont.equals("Europa")){
					cont = "Resposta Errada!: A certa era America do Sul";
				} else if (cont.equals("Asia")){
					cont = "Resposta Errada!: A certa era America do Sul";
				} else if (cont.equals("Africa")){
					cont = "Resposta Errada!: A certa era America do Sul";
				} else {
					cont = "Questão não Respondida";
				}

				// Verifica matérias selecionadas
				String copasSelec = "";
				if (cbCopa1.isSelected())
					copasSelec += "1930, ";
				if (cbCopa2.isSelected())
					copasSelec += "1934, ";
				if (cbCopa3.isSelected())
					copasSelec += "1938, ";
				if (cbCopa4.isSelected())
					copasSelec += "1942, ";
				if (cbCopa5.isSelected())
					copasSelec += "1946, ";

				String resp3 = "1930, 1934, ";
				if (copasSelec.isEmpty()) {
					copasSelec = "Questão não respondida";
				} else if (copasSelec.equals(resp3)) {
					copasSelec = ("Resposta certa: " + copasSelec.substring(0, copasSelec.length() - 2)); 																				// vírgula
					pontos++;
				} else {
					copasSelec = "Resposta errada!";
				}

				String art = (String) cbPerg4.getSelectedItem();
				
				if (art.equals("Leonardo da Vinci")) {
					art = "Resposta Certa!: Leonardo Da Vinci";
					pontos++;
				} else if (art.equals("Michelangelo")){
					art = "Resposta Errada!: A certa era Leonardo Da Vinci";
				} else if (art.equals("Pablo Picasso")){
					art = "Resposta Errada!: A certa era Leonardo Da Vinci";
				}  else if (art.equals("Vincent Van Gogh")){
					art = "Resposta Errada!: A certa era Leonardo Da Vinci";
				}  else if (art.equals("Salvador Dalí")){
					art = "Resposta Errada!: A certa era Leonardo Da Vinci";
				} else {
					art = "Questão não Respondida";
				}


				String pais = "";
				if (rbChi.isSelected()) {
					pais = "Resposta errada";

				} else if (rbJp.isSelected()) {
					pais = "Resposta Certa!";
					pontos++;

				} else if (rbInd.isSelected()) {
					pais = "Resposta errada";

				} else if (rbCdS.isSelected()) {
					pais = "Resposta errada";

				} else if (rbTai.isSelected()) {
					pais = "Resposta errada";
				} else {
					pais = "Questão não respondida";
				}

				// Exibe informações
				JOptionPane.showMessageDialog(null,
						"\nQuestao 1: " + resp + 
						"\nQuestão 2: " + cont + 
						"\nQuestão 3: " + copasSelec + 
						"\nQuestão 4: " + art + 
						"\nQuestão 5: " + pais + 
						"\nPontução Final: " + pontos + "/5");
			}
		});

		setVisible(true); // Última linha do construtor
	}

	public static void main(String[] args) {
		new FormularioAluno();
	}
}
