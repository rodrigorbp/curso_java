package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.printf("Megasena: %d %d %d %d %d %d ", 1, 2,3, 4, 5, 6);
		
		System.out.printf("Salário: %.2f%n ", 1234.5468);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d", nome, sobrenome, idade);
		
		entrada.close();
		
	}

}
