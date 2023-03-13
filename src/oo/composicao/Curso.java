package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

	public Curso(String nome) {
		//super();
		this.nome = nome;
	}

}
