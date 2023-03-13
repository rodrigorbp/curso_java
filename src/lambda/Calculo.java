package lambda;

@FunctionalInterface
public interface Calculo {
	//Uma interface funcional pode ter soemnte um único método abstrato	
	public abstract double executar(double a, double b);
	
	//não tem problema em ter um método default
	default String testeDefault() {
		return "default";
	}
	
	static String testeEstatico() {
		return "estatico";
	}
	

}
