package fiap_metodos_static;

public class Impressora {
	
	public static void exibir(float a, float b) {
		System.out.printf("Esses números são float: %f , %f", a , b);
	}
	
	public static void exibir(float a, float b , String c) {
		System.out.printf("Dois floats e uma String: %f , %f , %s", a , b, c);
	}
	
	public static void exibir(float a, float b, double c, double d) {
		System.out.printf("Dois floats e dois doubles: %f , %f, %d , %d", a , b, c, d);
	}
	
	public static void exibir(int a) {
		System.out.printf("Un inteiro: %f", a);
	}
	

}
