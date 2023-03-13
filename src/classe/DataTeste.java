package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 19;
		d1.mes = 1;
		d1.ano = 1977;
		
		System.out.printf(d1.obterDataFormatada()+"\n");
		
		Data d2 = new Data(22, 2, 2013);
		
		System.out.printf(d2.obterDataFormatada()+"\n");
		
		d1.imprimirDataFormatada();
	}

}
