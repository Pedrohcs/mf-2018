package dto;

public class CertidaoDTO {
	private char[] identificador = new char[36];
	private int tipo;
	private String cartorio;
	private int livro;
	private int folha;
	private int termo;
	
	public char[] getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char[] identificador) {
		this.identificador = identificador;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	public int getLivro() {
		return livro;
	}
	public void setLivro(int livro) {
		this.livro = livro;
	}
	public int getFolha() {
		return folha;
	}
	public void setFolha(int folha) {
		this.folha = folha;
	}
	public int getTermo() {
		return termo;
	}
	public void setTermo(int termo) {
		this.termo = termo;
	}
	
}
