package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Duda", "Maju", "Rodrigo", "Teresa");
		
		System.out.println("Usando o foreach");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando o foreach");
		Iterator<String> iterador = aprovados.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		System.out.println("\nUsando o stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);  //Laço interno
	}

}
