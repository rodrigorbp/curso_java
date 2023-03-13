package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		
		Double coisaA = (Double) caixaA.abrir();
		System.err.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("string");
		
		String coisaB = (String) caixaB.abrir();
		System.err.println(coisaB);
	}

}
