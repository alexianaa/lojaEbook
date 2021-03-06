package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ControleDados;
import controller.ControleEditora;

@SuppressWarnings("serial")
public class ViewEditora extends JFrame implements ActionListener {
	JButton botaoBusca;
	JButton botaoAdicionaEditora;
	JButton botaoVoltar;
	JButton botaoVoltar2;
	JButton botaoExcluir;
	JLabel texto1;
	JTextField campoTexto;
	private ControleDados dados;
	private String cliente;
	private String editora;

	ViewEditora() {
		// Campo de texto
		campoTexto = new JTextField();
		campoTexto.setBounds(440, 100, 400, 50);
		campoTexto.setFont(new Font("Comic Sans", Font.BOLD, 40));
		campoTexto.setForeground(new Color(0x74FF68));
		campoTexto.setBackground(Color.darkGray);
		campoTexto.setCaretColor(Color.white);
		campoTexto.setText("Nome Editora");
		campoTexto.setHorizontalAlignment(JTextField.CENTER);

		texto1 = new JLabel();
		texto1.setText("Buscar Editora");
		texto1.setBounds(440, 20, 400, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		botaoBusca = new JButton("Buscar");
		botaoAdicionaEditora = new JButton("Adicionar Editora");
		botaoVoltar = new JButton("Voltar");

		botaoBusca.setBounds(490, 155, 300, 40);
		botaoAdicionaEditora.setBounds(540, 500, 200, 40);
		botaoVoltar.setBounds(540, 580, 200, 40);

		botaoBusca.setFocusable(false);
		botaoAdicionaEditora.setFocusable(false);
		botaoVoltar.setFocusable(false);

		botaoBusca.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoAdicionaEditora.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoVoltar.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoBusca.setForeground(Color.cyan);
		botaoAdicionaEditora.setForeground(Color.cyan);
		botaoVoltar.setForeground(Color.cyan);

		botaoBusca.setBackground(Color.darkGray);
		botaoAdicionaEditora.setBackground(Color.darkGray);
		botaoVoltar.setBackground(Color.darkGray);

		botaoBusca.addActionListener(this);
		botaoAdicionaEditora.addActionListener(this);
		botaoVoltar.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Buscar Editoras");
		this.getContentPane().setBackground(Color.gray);
		this.add(texto1);
		this.add(campoTexto);
		this.add(botaoBusca);
		this.add(botaoAdicionaEditora);
		this.add(botaoVoltar);
		this.setVisible(true);
	}

	ViewEditora(String texto, String[] s) {
		editora = texto;

		JLabel item0 = new JLabel("E-mail: " + s[0]);
		JLabel item1 = new JLabel("Numero: " + s[1]);
		JLabel item2 = new JLabel("CNPJ: " + s[2]);
		JLabel item3 = new JLabel("Data de afiliacao: " + s[3]);
		JLabel item4 = new JLabel("ID: " + s[4]);
		item0.setFont(new Font("Comic Sans", Font.BOLD, 38));
		item1.setFont(new Font("Comic Sans", Font.BOLD, 38));
		item2.setFont(new Font("Comic Sans", Font.BOLD, 38));
		item3.setFont(new Font("Comic Sans", Font.BOLD, 38));
		item4.setFont(new Font("Comic Sans", Font.BOLD, 38));

		JPanel itens = new JPanel();
		itens.setLayout(new GridLayout(10, 1));
		itens.setBackground(Color.gray);
		itens.setBounds(250, 73, 980, 350);
		itens.add(item0);
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);

		texto1 = new JLabel();
		texto1.setText("Editora" + " " + texto);
		texto1.setBounds(0, 20, 1280, 50);
		texto1.setForeground(Color.cyan);
		texto1.setFont(new Font("Comic Sans", Font.BOLD, 50));
		texto1.setHorizontalAlignment(JLabel.CENTER);

		botaoVoltar2 = new JButton("Voltar");
		botaoExcluir = new JButton("Excluir Editora do sistema");

		botaoVoltar2.setBounds(540, 580, 200, 40);
		botaoExcluir.setBounds(440, 450, 400, 40);

		botaoVoltar2.setFocusable(false);
		botaoExcluir.setFocusable(false);

		botaoVoltar2.setFont(new Font("Comic Sans", Font.BOLD, 20));
		botaoExcluir.setFont(new Font("Comic Sans", Font.BOLD, 20));

		botaoVoltar2.setForeground(Color.cyan);
		botaoExcluir.setForeground(Color.cyan);

		botaoVoltar2.setBackground(Color.darkGray);
		botaoExcluir.setBackground(Color.darkGray);

		botaoVoltar2.addActionListener(this);
		botaoExcluir.addActionListener(this);

		this.setLayout(null);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Editora" + " " + texto);
		this.add(itens);
		this.getContentPane().setBackground(Color.gray);
		this.add(texto1);
		this.add(botaoVoltar2);
		this.add(botaoExcluir);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == botaoBusca) {
			if (ControleEditora.existeEditora(campoTexto.getText())) {
				this.dispose();
				String[] s = ControleEditora.infoEditora(campoTexto.getText());
				new ViewEditora(campoTexto.getText(), s);
			} else {
				JOptionPane.showMessageDialog(null, "Esta editora nao existe\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (src == botaoAdicionaEditora) {
			new ViewCadastro(dados, 1);
		} else if (src == botaoVoltar) {
			this.dispose();
		} else if (src == botaoVoltar2) {
			this.dispose();
		} else if (src == botaoExcluir) {
			if (ControleEditora.excluirEditora(editora)) {
				JOptionPane.showMessageDialog(null, "Editora deletada com sucesso\n", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nao foi possivel deletar esta editora\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
			this.dispose();
		}
	}
}
