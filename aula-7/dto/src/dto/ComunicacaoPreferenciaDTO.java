package dto;

public class ComunicacaoPreferenciaDTO {

	private char[] codigo = new char[1];
	private String descricao;
	
	public char[] getCodigo() {
		return codigo;
	}
	public void setCodigo(char[] codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
