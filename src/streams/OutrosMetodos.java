package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana",7.1);
		Aluno a2 = new Aluno("Luna",7.2);
		Aluno a3 = new Aluno("Pedro",8.1);
		Aluno a4 = new Aluno("Duda",10);
		Aluno a5 = new Aluno("Ana",7.1);
		Aluno a6 = new Aluno("Jose",7.2);
		Aluno a7 = new Aluno("Maria",8.1);
		Aluno a8 = new Aluno("Duda",10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(3).forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
	}

}
