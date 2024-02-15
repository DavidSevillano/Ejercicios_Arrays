import java.util.*;

public class Ej4_Array_de_0_a_900 {
	
//Crear una tabla que contenga todos los números del 0 al 900 y mostrarla	

	public static void main(String[] args) {
		
	int array[] = new int [901];
	
	for (int i=0;i<array.length;i++) {
		
		array[i]=i;
		
	}
	System.out.println(Arrays.toString(array));	
		

	}

}
