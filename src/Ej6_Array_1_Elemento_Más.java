import java.util.*;

public class Ej6_Array_1_Elemento_Más {

/*Crear una función a la que se le pase una tabla y devuelva otra igual pero con un elemento más 
 * (que también se le pasa como parámetro)
 */
	
	static int arraymas (int array[], int elemento ) {
	
	int array2[] = new int[array.length+1];// Declaramos el nuevo array con un elemento más que el array del parametro
	
	for(int i=0;i<array.length;i++) {//Le asignamos los mismos valores que tiene el array original al nuevo
		
	array2[i]=array[i];
	
	}array2[array.length]=elemento;/*Al indice que es igual a la longitud del array original le ponemos el valor
	                               *que introdujimos en el parametro de entrada
	                               */
	
	System.out.println(Arrays.toString(array2)); //Mostramos el nuevo array
	return 0;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
	Scanner sc = new Scanner (System.in);
	
	int array[] = new int [3];
	
	for (int i=0; i<array.length;i++) { //Recorremos el array
		
		System.out.println("Introduce un valor al array");
		array[i]=sc.nextInt();
		
	}
	System.out.println("Que numero le quieres añadir al array?");//Pedimos el nuevo valor que tendra el array
	int n=sc.nextInt();
	
	arraymas(array,n);
		
		

	}

}
