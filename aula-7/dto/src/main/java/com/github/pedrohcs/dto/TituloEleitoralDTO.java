package com.github.pedrohcs.dto;

public class TituloEleitoralDTO {

		private char[] identificador = new char[36];
		private int zona;
		private int sessao;
		
		public char[] getIdentificador() {
			return identificador;
		}
		public void setIdentificador(char[] identificador) {
			this.identificador = identificador;
		}
		public int getZona() {
			return zona;
		}
		public void setZona(int zona) {
			this.zona = zona;
		}
		public int getSessao() {
			return sessao;
		}
		public void setSessao(int sessao) {
			this.sessao = sessao;
		}		
		
}
