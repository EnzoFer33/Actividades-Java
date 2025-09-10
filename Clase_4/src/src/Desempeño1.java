package src;

import java.util.Scanner;

public class Desempeño1 {
	private Scanner teclado;
	private int[] array;
	
	public Desempeño1() {
		teclado = new Scanner(System.in);
		array = new int[4];
	}
	
	public void cargar() {
		for (int f = 0; f < 4; f++) {
			System.out.print("Ingrese valor de la componente:");
			array[f] = teclado.nextInt();
		}
	}
	
	public void imprimir() {
		System.out.println(array);
	}
	
	
	public static void main(String[] args) {
		

	}

}
