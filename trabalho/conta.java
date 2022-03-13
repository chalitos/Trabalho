package trabalho;

public class conta extends usuario {
	private double saldo_corrente;
	private double saldo_poupanca;
	private double emprestimo_total;
	private String numero_cart;
	private int data_venc;
	private int CVV;
	private int membro_desdes;
	
	public double getsaldo_corrente() {
		return saldo_corrente;
	}
	public void setsaldo_corrente(double saldo_corrente) {
		this.saldo_corrente = saldo_corrente;
	}
	public double getsaldo_poupanca() {
		return saldo_poupanca;
	}
	public void setsaldo_poupanca(double saldo_poupanca) {
		this.saldo_poupanca = saldo_poupanca;
	}
	public double getemprestimo_total() {
		return emprestimo_total;
	}
	public void setemprestimo_total(double emprestimo_total) {
		this.emprestimo_total = emprestimo_total;
	}
	public String getnumero_cart() {
		return numero_cart;
	}
	public void setnumero_cart(String numero_cart) {
		this.numero_cart = numero_cart;
	}
	public int getdata_venc() {
		return data_venc;
	}
	public void setdata_venc(int data_venc) {
		this.data_venc = data_venc;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int CVV) {
		this.CVV = CVV;
	}
	public int getmembro_desdes() {
		return membro_desdes;
	}
	public void setmembro_desdes(int membro_desdes) {
		this.membro_desdes = membro_desdes;
	}
	
	
	

}
