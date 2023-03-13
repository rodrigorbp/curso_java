package generics;

public class CaixaGenericaTeste {
	
	public static void main(String[] args) {
		
		CaixaGenerica<String> caixaA = new CaixaGenerica<>();
		caixaA.guardar("String caixa A");
		System.out.println(caixaA.abrir());
		
		CaixaGenerica<Double> caixaB = new CaixaGenerica<>();
		caixaB.guardar(3.1415);
		System.out.println(caixaB.abrir());
	}

}
