package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia o Add retorna uma exceção e o offer não adiciona e retorna false
		fila.add("Ana"); //lança uma exceção
		fila.offer("Bia"); //retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Maria");
		
		for(String item: fila) {
			System.out.println(item);
		}
		
		//Peek e Element obtém um elemento da fila sem remover
		System.out.println(fila.peek()); //retorna falso se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção quando a fila está vazia
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		//filça.contains();
		
		//Poll e remove obtém o próximo elemento da fila
		
		System.out.println(fila.poll()); //retorna falso se a fila estiver vazia
		System.out.println(fila.remove()); //lança uma exceção quando a fila está vazia
		
		
		
	}

}
