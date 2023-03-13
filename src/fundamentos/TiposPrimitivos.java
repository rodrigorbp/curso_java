package fundamentos;

class TiposPrimitivos {
	
	public static void main(String[] args) {
		//tipos numerios inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845223L;
		
		//tipos numéricos reais
		float salario = 11445.48F;
		double vendasAcumuladas = 2991797103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caracter
		char status = 'A';
		
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		System.out.println("Números de viagens: " + numeroDeVoos /2);
		
		System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
	}

}
