package model;

public class Editora extends Entidade {

	private String cnpj;
	private String dataAfiliacao;

	/**
	 * Recebe os atributos da classe abstrata Entidade
	 */
	public Editora() {
		super();
	}

	/**
	 * Cria uma editora
	 * 
	 * @param n   - nome
	 * @param e   - email
	 * @param i   - id
	 * @param num - numero de telefone
	 * @param c   - cnpj
	 * @param d   - data de afiliacao ao site
	 */
	public Editora(String n, String e, int i, Telefone num, String c, String d) {
		this.nome = n;
		this.email = e;
		this.id = i;
		this.numCel = num;
		cnpj = c;
		dataAfiliacao = d;
	}

	@Override
	public String toString() {
		return "Editora: " + this.nome + "\nEmail: " + this.email + "\nId: " + this.id + "\nTelefone: " + this.numCel
				+ "\nCNPJ: " + this.cnpj + "\nData de afiliacao: " + this.dataAfiliacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDataAfiliacao() {
		return dataAfiliacao;
	}

	public void setDataAfiliacao(String dataAfiliacao) {
		this.dataAfiliacao = dataAfiliacao;
	}

	public String getNomeEditora() {
		return nome;
	}

	public void setNomeEditora(String nome) {
		this.nome = nome;
	}

}
