package sortersTesterClasses;

import java.util.Comparator;
import java.util.Random;
import sortersTesterClasses.Entero;
import sorterClasses.BubbleSortSorter;
import sorterClasses.SelectionSortSorter;

public class Entero_tester { 
	public static void main(String[] args) {
		SelectionSortSorter nuevo = new SelectionSortSorter();
		Comparator cNuevo = null;
		Entero[] array = new Entero[6];
		array[0]= new Entero(4);
		array[1] = new Entero(6);
		array[2] = new Entero(2);
		array[3] = new Entero(7);
		array[4] = new Entero(8);
		array[5] = new Entero(3);
		System.out.println("Before sorting:");
		for (int i = 0; i<array.length;i++)
		System.out.println(array[i]);
		nuevo.sort(array, cNuevo);
		System.out.println("\nAfter sorting:");
		for (int i = 0; i<array.length;i++)
			System.out.println(array[i]);
	}

}
