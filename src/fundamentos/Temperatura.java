package fundamentos;

class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "ºC");
		
		fahrenheit = 32;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "ºC");
	}

}
