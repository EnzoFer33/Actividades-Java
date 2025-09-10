package src;

import java.util.Arrays;

public class Desempeño3 {
	private int[][] array;
	
	public Desempeño3() {
		array = new int[4][4];
		
	}
	
	
	public void cargar() {
		int min = 1;
		int max = 9;
		for (int f = 0; f < array.length; f++) {
			for( int e = 0; e < array[f].length; e++) {
				int n = (int)(Math.random() * (max - min + 1)) + min;
				array[f][e] = n;
			}
		}
		for(int[] array1  : array) {
			System.out.println(Arrays.toString(array1));
		}		
	}
	
	public void sumar1() {
		int suma = 0;
		for (int g = 0; g < array.length; g++) {
			suma += array[g][g];
		}
		System.out.print("La suma de los valores es: "+ suma);
	}
	
	public void sumar2() {
		int suma = 0;
	}
	
	public static void main(String[] args) {
		Desempeño3 de = new Desempeño3();
		de.cargar();
		de.sumar1();
	}

}
