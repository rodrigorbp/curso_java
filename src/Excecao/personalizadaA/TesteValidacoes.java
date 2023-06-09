package Excecao.personalizadaA;

import Excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7);
			
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaDoIntervaloException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) { 
			System.out.println(e.getMessage()); 
		}
		
		System.out.println("Fim!!!");
	}

}
