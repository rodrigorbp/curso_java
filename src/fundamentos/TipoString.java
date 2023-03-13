package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("Boa"));
		
		var nome = "Pedro";
		var sobrenome = "Pereira";
		var idade = 35;
		var salario = 12345.984;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		
		System.out.printf("O Senho %s %s tem %d anos e ganha R$ %.2f!", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO Senho %s %s tem %d anos e ganha R$ %.2f!", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}

}
