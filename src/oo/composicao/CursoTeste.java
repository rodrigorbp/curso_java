package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Ana");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("C# .Net");
		Curso curso3 = new Curso("Delphi");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		System.out.println("Matriculados no curso " + curso1.nome);
		for(Aluno aluno: curso1.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println("Matriculados no curso " + curso2.nome);
		for(Aluno aluno: curso2.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println("Matriculados no curso " + curso3.nome);
		for(Aluno aluno: curso3.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println(aluno3.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) {
			System.out.print(cursoEncontrado.nome + ": ");
			System.out.println(cursoEncontrado.alunos);
		}
		
		
			
	}

}
