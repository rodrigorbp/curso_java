package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 5.1;
		String resultadoParcial = media >= 5.0 ? "em recuperacao" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal);
	}

}
