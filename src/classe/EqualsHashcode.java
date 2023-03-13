package classe;

public class EqualsHashcode {
	
public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Rodrigo BP";
		u1.email = "rodrigo@empresa.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Rodrigo BP";
		u2.email = "rodrigo@empresa.com.br";
		
		System.out.println(u1 == u2);
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
			
	}

}
