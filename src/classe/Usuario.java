package classe;

public class Usuario {
	
	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {

		if(objeto instanceof Usuario) { //verifica se o objeto passado é o mesmo tipo de objeto
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
			
		} else {
			return false;
		}
		
	}
	
	//O hashcode será abordado em outra aula
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.nome.length();
	}

}
