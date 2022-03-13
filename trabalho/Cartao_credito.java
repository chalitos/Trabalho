package trabalho;

public class Cartao_credito extends usuario{
	private int data_venc;
	private int CVV;
	private int membro_desde;
	private String numero_cartao;
	private double limite;
	private double fatura_atual;
	
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
	public int getmembro_desde() {
		return membro_desde;
	}
	public void setmembro_desde(int membro_desde) {
		this.membro_desde = membro_desde;
	}
	public String getnumero_cartao() {
		return numero_cartao;
	}
	public void setnumero_cartao(String numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	public double getlimite() {
		return limite;
	}
	public void setlimite(double limite) {
		this.limite = limite;
	}
	public double getfatura_atual() {
		return fatura_atual;
	}
	public void setfatura_atual(double fatura_atual) {
		this.fatura_atual = fatura_atual;
	}
}
