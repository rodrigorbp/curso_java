package fundamentos;

class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s.toUpperCase();//não altera o valor original
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Bom dia X"
				.replace("X", "Senhora")
				.toUpperCase()
				.concat("!!!");
		
		String y = "Bom dia X".replace("X", "Senhora").toUpperCase().concat("!!!");
		
		
	}

}
