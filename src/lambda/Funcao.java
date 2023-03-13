package lambda;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> oResultaoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultaoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
	}

}
