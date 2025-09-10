package src;

import java.util.Scanner;

public class Desempeño1 {
	private Scanner teclado;
	private int[] array;
	
	public Desempeño1() {
		array = new int[4];
	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		for (int f = 0; f < 4; f++) {
			System.out.print("Ingrese valor de la componente:");
			array[f] = teclado.nextInt();
		}
	}
	
	public void recorrer() {
		int suma = 0;
		for (int f = 0; f < 4; f++) {
			 suma += array[f] ;
		}
		System.out.println(suma);
	}
	
	public void mayor() {
		for (int f = 0; f < 4; f++) {
			if (array[f] >= 50) {
				System.out.println(array[f]);
			}
		}
	}
	
	public static void main(String[] args) {
		Desempeño1 de = new Desempeño1();
		de.cargar();
		de.recorrer();
		de.mayor();

	}

}
