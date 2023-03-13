package Excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception{

	private String nomeDoAtributo;

	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		//return super.getMessage();
		return String.format("O atributo '%s' está com fora valor do intervalo", nomeDoAtributo);
	}
	
	

}
