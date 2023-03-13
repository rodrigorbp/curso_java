package Excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}		
		System.out.println("Fim!");
	}
	
	// Exceção não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01!");		
	}
	
	//Exceção checada ou erificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02!");		
	}
}
