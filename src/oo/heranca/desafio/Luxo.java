package oo.heranca.desafio;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() { //implementação padrão, não é necessário a classe que utiliza a interface implementar este método
		return 1;
	}
}
