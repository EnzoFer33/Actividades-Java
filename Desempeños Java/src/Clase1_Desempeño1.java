
// 1. Generar un valor aleatorio entre 0 y 1000. Mostrar la cantidad de dígitos que tiene dicho número.

public class Clase1_Desempeño1 {

	public static void main(String[] args) {
		int aleatorio = 0+(int)(Math.random()*1000);
		if (aleatorio >= 0 && aleatorio <= 9) {
			System.out.println(aleatorio);
			System.out.println("El numero aleatorio tiene 1 digito");
		} else if (aleatorio >= 10 && aleatorio <= 99) {
			System.out.println(aleatorio);
			System.out.println("El numero aleatorio tiene 2 digitos");
		} else if (aleatorio >= 100 && aleatorio <= 999) {
			System.out.println(aleatorio);
			System.out.println("El numero aleatorio tiene 3 digitos");
		} else if (aleatorio >= 1000) {
			System.out.println(aleatorio);
			System.out.println("El numero aleatorio tiene 4 digitos");
		}
	}

}
