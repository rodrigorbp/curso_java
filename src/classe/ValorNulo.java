package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("!!!"));
		}
			
		
		//Não pode acessar atributo ou método de um objeto que esteja nulo
		
	}
	
	

}
