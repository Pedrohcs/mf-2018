package dto;

public class ComunicacaoDTO {

	private char[] individuo = new char[36];
	private int meio;
	private char[] preferencia = new char[1];
	private String detalhe;
	private int uso;
	
	public char[] getIndividuo() {
		return individuo;
	}
	public void setIndividuo(char[] individuo) {
		this.individuo = individuo;
	}
	public int getMeio() {
		return meio;
	}
	public void setMeio(int meio) {
		this.meio = meio;
	}
	public char[] getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(char[] preferencia) {
		this.preferencia = preferencia;
	}
	public String getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}
	public int getUso() {
		return uso;
	}
	public void setUso(int uso) {
		this.uso = uso;
	}
	
}
