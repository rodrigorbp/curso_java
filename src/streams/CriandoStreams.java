package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<String> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n "};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1 , 3).forEach(print); //Inclui do índice 1 até o índice 

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		System.out.println("Stream Paralelo");
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print); //ggra sem ordenação

		//Stream.iterate(0, n -> n +1).forEach(println); //gera à partir do 0
		
	}

}
