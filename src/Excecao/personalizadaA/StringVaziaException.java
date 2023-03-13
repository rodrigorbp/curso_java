package Excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		//return super.getMessage();
		return String.format("O atributo '%s' está com valor nulo ou vazio", nomeDoAtributo);
	}
	
	

}
