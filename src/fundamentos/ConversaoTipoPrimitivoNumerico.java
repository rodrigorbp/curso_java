package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.123456789999; //explícita (CAST)
		System.out.println(b);
		
		int c = 256;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
	}

}
