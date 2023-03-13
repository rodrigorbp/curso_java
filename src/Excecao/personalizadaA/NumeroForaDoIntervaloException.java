package Excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException{

	private String nomeDoAtributo;

	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		//return super.getMessage();
		return String.format("O atributo '%s' está com fora valor do intervalo", nomeDoAtributo);
	}
	
	

}
