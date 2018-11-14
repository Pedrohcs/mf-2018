package dto;

public class ComunicacaoMeioDTO {

	private int codigo;
	private String descricao;
	private char[] alternativo = new char[1];
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public char[] getAlternativo() {
		return alternativo;
	}
	public void setAlternativo(char[] alternativo) {
		this.alternativo = alternativo;
	}
	
}
