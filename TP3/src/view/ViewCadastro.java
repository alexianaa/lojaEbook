package view;

/**
 * @version 1.8
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controller.ControleCliente;
import controller.ControleDados;
import controller.ControleEbook;
import controller.ControleEditora;

public class ViewCadastro implements ActionListener {

	private JFrame janela;
	private JLabel titulo;
	@SuppressWarnings("unused")
	private static ControleDados dados;
	private static ControleCliente cliente = new ControleCliente();
	private static ControleEditora editora = new ControleEditora();
	private static ControleEbook ebook = new ControleEbook();
	private JButton concluirCliente = new JButton("Concluir");
	private JButton concluirEditora = new JButton("Concluir");
	private JButton concluirEbook = new JButton("Concluir");
	private JTextField tituloField = new JTextField(200);
	private JTextField autorField = new JTextField(200);
	private JTextField categoriaField = new JTextField(200);
	private JTextField sinposeField = new JTextField(200);
	private JTextField idiomaField = new JTextField(200);
	private JTextField valorEbookField = new JTextField(200);
	private JTextField tamArqField = new JTextField(200);
	private JTextField pagField = new JTextField(200);
	private JTextField anoPubField = new JTextField(200);
	private JTextField editoraNomeField = new JTextField(200);
	private JTextField nomeField;
	private JTextField emailField;
	private JFormattedTextField cpfField;
	private JFormattedTextField dddField;
	private JFormattedTextField numeroField;
	private JFormattedTextField txtDateField;
	private JTextField cnpjField;
	private JTextField dataField;
	private JTextField dddField2;
	private JTextField numeroField2;
	private String cnpjValue;
	private String nomeValue;
	private String emailValue;
	private String dataValue;
	private String dddValue;
	private String cpfValue;
	private String numeroValue;
	private String tituloValue;
	private String autorValue;
	private String categoriaValue;
	private String sinopseValue;
	private String idiomaValue;
	private String valorEbookValue;
	private String tamArqValue;
	private String pagValue;
	private String anoPubValue;
	private String editoraNomeValue;

	/**
	 * Criacao da tela de cadastro de editora, cliente e ebook
	 * 
	 * @param d  - dados armazenados
	 * @param op - qual cadastro vai ser realizado
	 */
	public ViewCadastro(ControleDados d, int op) {
		dados = d;

		JLabel nomeText, emailText, numeroText;
		JLabel cpfText, txtDateText;
		JLabel cnpjText, dataText;
		JLabel tituloTxt, autorTxt, categoriaTxt, sinopseTxt, idiomaTxt, valorEbookTxt, tamArqTxt, pagTxt, anoPubTxt,
				editoraNome;

		switch (op) {
		case 1: // cadastro de editora
			janela = new JFrame("Loja de Ebook");
			titulo = new JLabel("Cadastro");
			titulo.setFont(new Font("Arial", Font.BOLD, 30));
			titulo.setBounds(200, 30, 150, 30);
			// cria os titulos de cada espaco
			nomeText = new JLabel("Nome: ");
			emailText = new JLabel("E-mail: ");
			numeroText = new JLabel("Numero: ");
			cnpjText = new JLabel("CNPJ: ");
			dataText = new JLabel("Data de afiliacao: ");
			// cria o campo que vai receber as informacoes
			nomeField = new JTextField(200);
			emailField = new JTextField(200);
			MaskFormatter mascaraCNPJ = null;
			MaskFormatter mascaraDateEdt = null;
			MaskFormatter mascaraNumero = null;
			MaskFormatter mascaraDDD = null;
			try {
				mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
				mascaraDateEdt = new MaskFormatter("##/##/####");
				mascaraDDD = new MaskFormatter("##");
				mascaraNumero = new MaskFormatter("#####-####");
				mascaraCNPJ.setPlaceholderCharacter('_');
				mascaraDDD.setPlaceholderCharacter('_');
				mascaraNumero.setPlaceholderCharacter('_');
				mascaraDateEdt.setPlaceholderCharacter('_');
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnpjField = new JFormattedTextField(mascaraCNPJ);
			dataField = new JFormattedTextField(mascaraDateEdt);
			dddField2 = new JFormattedTextField(mascaraDDD);
			numeroField2 = new JFormattedTextField(mascaraNumero);
			// define os tamanhos de cada label
			nomeText.setBounds(100, 100, 80, 30);
			emailText.setBounds(100, 160, 80, 30);
			numeroText.setBounds(100, 220, 80, 30);
			cnpjText.setBounds(100, 280, 80, 30);
			dataText.setBounds(100, 340, 120, 30);
			// define os tamanhos de cada field
			nomeField.setBounds(260, 100, 160, 30);
			emailField.setBounds(260, 160, 160, 30);
			dddField2.setBounds(260, 220, 40, 30);
			numeroField2.setBounds(320, 220, 100, 30);
			cnpjField.setBounds(260, 280, 160, 30);
			dataField.setBounds(260, 340, 160, 30);
			concluirEditora.setBounds(170, 420, 200, 30);
			// adiciona os componentes a janela
			janela.add(concluirEditora);
			janela.add(nomeText);
			janela.add(emailText);
			janela.add(numeroText);
			janela.add(cnpjText);
			janela.add(dataText);
			janela.add(nomeField);
			janela.add(emailField);
			janela.add(dddField2);
			janela.add(numeroField2);
			janela.add(cnpjField);
			janela.add(dataField);
			janela.add(titulo);
			janela.setLayout(null);
			janela.setSize(560, 510);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setVisible(true);
			concluirEditora.addActionListener(this);
			break;
		case 2: // cadastro de cliente
			janela = new JFrame("Loja de Ebook");
			titulo = new JLabel("Cadastro");
			titulo.setFont(new Font("Arial", Font.BOLD, 30));
			titulo.setBounds(200, 30, 150, 30);
			// cria os titulos de cada espaco
			nomeText = new JLabel("Nome: ");
			emailText = new JLabel("E-mail: ");
			numeroText = new JLabel("Numero: ");
			cpfText = new JLabel("CPF: ");
			txtDateText = new JLabel("Data de nascimento: ");
			// cria o campo que vai receber as informacoes
			nomeField = new JTextField(200);
			emailField = new JTextField(200);
			MaskFormatter mascaraCPF = null;
			MaskFormatter mascaraNumero2 = null;
			MaskFormatter mascaraDDD2 = null;
			MaskFormatter mascaraDate = null;
			try {
				mascaraCPF = new MaskFormatter("#########-##");
				mascaraDDD2 = new MaskFormatter("##");
				mascaraNumero2 = new MaskFormatter("#####-####");
				mascaraDate = new MaskFormatter("##/##/####");
				mascaraCPF.setPlaceholderCharacter('_');
				mascaraDDD2.setPlaceholderCharacter('_');
				mascaraNumero2.setPlaceholderCharacter('_');
				mascaraDate.setPlaceholderCharacter('_');
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cpfField = new JFormattedTextField(mascaraCPF);
			dddField = new JFormattedTextField(mascaraDDD2);
			numeroField = new JFormattedTextField(mascaraNumero2);
			txtDateField = new JFormattedTextField(mascaraDate);
			// define os tamanhos de cada label
			nomeText.setBounds(100, 100, 80, 30);
			emailText.setBounds(100, 160, 80, 30);
			numeroText.setBounds(100, 220, 80, 30);
			cpfText.setBounds(100, 280, 80, 30);
			txtDateText.setBounds(100, 340, 120, 30);
			// define os tamanhos de cada field
			nomeField.setBounds(260, 100, 160, 30);
			emailField.setBounds(260, 160, 160, 30);
			dddField.setBounds(260, 220, 40, 30);
			numeroField.setBounds(320, 220, 100, 30);
			cpfField.setBounds(260, 280, 160, 30);
			txtDateField.setBounds(260, 340, 160, 30);
			concluirCliente.setBounds(190, 420, 200, 30);
			// adiciona os componentes a janela
			janela.add(concluirCliente);
			janela.add(nomeText);
			janela.add(emailText);
			janela.add(numeroText);
			janela.add(cpfText);
			janela.add(txtDateText);
			janela.add(nomeField);
			janela.add(emailField);
			janela.add(dddField);
			janela.add(numeroField);
			janela.add(cpfField);
			janela.add(txtDateField);
			janela.add(titulo);
			janela.setLayout(null);
			janela.setSize(560, 510);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setVisible(true);
			concluirCliente.addActionListener(this);
			break;
		case 3: // cadastrar ebook
			janela = new JFrame("Loja de Ebook");
			titulo = new JLabel("Cadastro");
			titulo.setFont(new Font("Arial", Font.BOLD, 30));
			titulo.setBounds(200, 30, 150, 30);
			// cria os titulos de cada espaco
			tituloTxt = new JLabel("Titulo: ");
			autorTxt = new JLabel("Autor: ");
			categoriaTxt = new JLabel("Categoria: ");
			sinopseTxt = new JLabel("Sinopse: ");
			idiomaTxt = new JLabel("Idioma: ");
			valorEbookTxt = new JLabel("Preco (R$): ");
			tamArqTxt = new JLabel("Tamanho do arquivo: ");
			pagTxt = new JLabel("Quantidade de paginas: ");
			anoPubTxt = new JLabel("Ano de publicacao: ");
			editoraNome = new JLabel("Editora: "); // verificar se a editora existe
			// define os tamanhos de cada label
			tituloTxt.setBounds(80, 100, 80, 30);
			autorTxt.setBounds(80, 140, 80, 30);
			categoriaTxt.setBounds(80, 180, 80, 30);
			sinopseTxt.setBounds(80, 220, 80, 30);
			idiomaTxt.setBounds(80, 260, 120, 30);
			valorEbookTxt.setBounds(80, 300, 120, 30);
			tamArqTxt.setBounds(80, 340, 150, 30);
			pagTxt.setBounds(80, 380, 380, 30);
			anoPubTxt.setBounds(80, 420, 120, 30);
			editoraNome.setBounds(80, 460, 120, 30);
			// define os tamanhos de cada field
			tituloField.setBounds(260, 100, 160, 30);
			autorField.setBounds(260, 140, 160, 30);
			categoriaField.setBounds(260, 180, 160, 30);
			sinposeField.setBounds(260, 220, 160, 30);
			idiomaField.setBounds(260, 260, 160, 30);
			valorEbookField.setBounds(260, 300, 160, 30);
			tamArqField.setBounds(260, 340, 160, 30);
			pagField.setBounds(260, 380, 160, 30);
			anoPubField.setBounds(260, 420, 160, 30);
			editoraNomeField.setBounds(260, 460, 160, 30);
			concluirEbook.setBounds(190, 520, 160, 30);
			// adiciona os componentes a janela
			janela.add(concluirEbook);
			janela.add(titulo);
			janela.add(tituloTxt);
			janela.add(autorTxt);
			janela.add(categoriaTxt);
			janela.add(sinopseTxt);
			janela.add(idiomaTxt);
			janela.add(valorEbookTxt);
			janela.add(tamArqTxt);
			janela.add(pagTxt);
			janela.add(anoPubTxt);
			janela.add(editoraNome);
			janela.add(tituloField);
			janela.add(autorField);
			janela.add(categoriaField);
			janela.add(sinposeField);
			janela.add(pagField);
			janela.add(idiomaField);
			janela.add(valorEbookField);
			janela.add(tamArqField);
			janela.add(anoPubField);
			janela.add(editoraNomeField);
			janela.setLayout(null);
			janela.setSize(560, 600);
			janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			janela.setVisible(true);
			concluirEbook.addActionListener(this);
			break;
		}
	}

	@Override
	/**
	 * Recebe os eventos dos botoes
	 * 
	 * @param e - acao realizada/botao selecionado
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == concluirCliente) {
			JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso\n", "Sucesso",
					JOptionPane.INFORMATION_MESSAGE);
			// voltar para o login
			janela.dispose();
			// criar variaveis que peguem os valores
			nomeValue = nomeField.getText();
			emailValue = emailField.getText();
			dataValue = txtDateField.getText();
			cpfValue = cpfField.getText();
			dddValue = dddField.getText();
			numeroValue = numeroField.getText();
			// enviar para o metodo em controlecliente
			cliente.cadastrarCliente(nomeValue, emailValue, dataValue, dddValue, numeroValue, cpfValue);
		} else if (src == concluirEditora) {
			janela.dispose();
			nomeValue = nomeField.getText();
			emailValue = emailField.getText();
			dddValue = dddField2.getText();
			int ddd = Integer.parseInt(dddValue);
			numeroValue = numeroField2.getText();
			cnpjValue = cnpjField.getText();
			dataValue = dataField.getText();
			if (editora.cadastrar(nomeValue, emailValue, ddd, numeroValue, cnpjValue, dataValue)) {
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso\n", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nao foi possivel realizar o cadastro\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (src == concluirEbook) {
			janela.dispose();
			tituloValue = tituloField.getText();
			autorValue = autorField.getText();
			categoriaValue = categoriaField.getText();
			sinopseValue = sinposeField.getText();
			idiomaValue = idiomaField.getText();
			valorEbookValue = valorEbookField.getText();
			tamArqValue = tamArqField.getText();
			pagValue = pagField.getText();
			anoPubValue = anoPubField.getText();
			editoraNomeValue = editoraNomeField.getText();
			double valor = Double.parseDouble(valorEbookValue);
			double tamArq = Double.parseDouble(tamArqValue);
			int pag = Integer.parseInt(pagValue);
			int ano = Integer.parseInt(anoPubValue);
			if (ebook.cadastrar(tituloValue, autorValue, categoriaValue, sinopseValue, idiomaValue, valor, tamArq, pag,
					ano, editoraNomeValue)) {
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso\n", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Nao foi possivel realizar o cadastro\n", "Erro",
						JOptionPane.INFORMATION_MESSAGE);
			}
			janela.dispose();
		}
	}
}
