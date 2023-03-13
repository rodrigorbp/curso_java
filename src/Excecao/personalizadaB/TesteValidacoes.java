package Excecao.personalizadaB;

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
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumeroForaDoIntervaloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim!!!");
	}

}
