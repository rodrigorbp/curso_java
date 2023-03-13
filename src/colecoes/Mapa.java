package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Ricardo"); //se existir a chave ele atualiza o valor
		usuarios.put(1, "Rodrigo");
		usuarios.put(2, "Duda");
		usuarios.put(3, "Maju");
		usuarios.put(4, "Teresa");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Duda"));
		System.out.println(usuarios.get(4));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + " ");
			System.out.println(usuario.getValue());
		}
		
		System.out.println(usuarios.remove(4));
		System.out.println(usuarios.remove(4, "Teste"));
	}

}
