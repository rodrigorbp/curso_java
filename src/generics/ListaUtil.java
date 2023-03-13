package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);		
	}
	
	// @: <T> - Define o tipoo genérico, não influenecia na chamada do método
	//o T define o tipo que será retornado que será igual ao tipo genérico 
	// List<T> Define que a lista esperada é igual ao tipo genérico
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);		
	}
	
	public static <A, B ,C> C TESTE(A paramA, B paramB, C paramC) {
		C teste = null;
		return teste;
	}

}
