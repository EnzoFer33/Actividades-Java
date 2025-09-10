package src;

import java.util.Scanner;

public class Desempeño2 {
	private Scanner teclado;
	private float[] array;
	
	public Desempeño2() {
		array = new float[5];
	}
	
	public void cargar() {
		teclado = new Scanner(System.in);
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese valor de la componente:");
			array[f] = teclado.nextFloat();
		}
	}
	
	
	public float promedio() {
		float suma = 0;
		float promedio = 0;
		for (int f = 0; f < 5; f++) {
			suma += array[f];
		}
		promedio = suma / 5;
		System.out.print(promedio);
		return promedio;
	}
	
	public void mayor(float promedio) {
		int cant1 = 0;
		int cant2 = 0;
		for (int f = 0; f < 4; f++) {
			if (array[f] > promedio) {
				cant1++;
			}else if (array[f] < promedio){
				cant2++;
			}
		}
		System.out.print("Las personas con una altura mayor al promedio son: "+cant1);
		System.out.print("Las personas con una altura menor al promedio son: "+cant2);
	}
	
	public static void main(String[] args) {
		Desempeño2 de = new Desempeño2();
		de.cargar();
		float promedio =de.promedio();
		de.mayor(promedio);
		

	}

}
