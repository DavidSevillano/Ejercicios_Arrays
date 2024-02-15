import java.util.*;

public class Ej2_Ordenar_Menor_a_Mayor {
//Ordenar la siguiente tabla [5,7,8,4,3,6,0,0,8,1] de menor a mayor.	
	

	public static void main(String[] args) {
	
	int array [] = {5,7,8,4,3,6,0,0,8,1}; //Declaramos el array
	
	Arrays.sort(array); //Lo ordenamos de menor a mayor
	
	System.out.println(Arrays.toString(array)); //Mostramos todo el array

	}

}
