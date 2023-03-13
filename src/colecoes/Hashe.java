package colecoes;

import java.util.HashSet;

public class Hashe {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Samuel"));
		
		boolean resultado = usuarios.contains(new Usuario("Ana")); 
		System.out.println(resultado);
	}

}
