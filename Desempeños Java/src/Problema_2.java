
public class Problema_2 {

	public static void main(String[] args) {
		int aleatorio=2+(int)(Math.random()*99);
		int x=2;
		System.out.println("Valores pares entre 2 y "+aleatorio);
		while (x<=aleatorio) {
			System.out.print(x+"-");
			x=x+2;
		}
	}
}
