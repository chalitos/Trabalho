package trabalho;

public class usuario {
	private String nome;
	private String Cpf;
	private int data_nasc;
	private int senha;
	private int agencia;
	private int conta;

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	public int getsenha() {
		return senha;
	}
	public void setsenha(int senha) {
		this.senha = senha;
	}
	public int getdata_nasc() {
		return data_nasc;
	}
	public void setdata_nasc(int data_nasc) {
		this.data_nasc = data_nasc;
	}
	public int getagencia() {
		return agencia;
	}
	public void setagencia(int agencia) {
		this.agencia = agencia;
	}
	public int getconta() {
		return conta;
	}
	public void setconta(int conta) {
		this.conta = conta;
	}
}
	


