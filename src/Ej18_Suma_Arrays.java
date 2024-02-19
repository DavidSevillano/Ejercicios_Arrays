import java.util.*;

public class Ej18_Suma_Arrays {
	
/*Crea una función a la que se le pasen dos tablas de enteros y devuelva
*otra con la suma. Ej. [1,7,8]+[5,0,1]= [6,7,9].	
*/
	public static int []sumaArray(int a[], int b[]) {
		
	int arraysuma[] = new int [a.length]; //Declaramos el array que almacenara la suma
	
	for (int i=0; i<arraysuma.length;i++) {
		
		arraysuma[i] = a[i] + b[i]; //El array va guardando en cada indice la suma de los arrays
		
	}
	return arraysuma;	//Devolvemos el array con la suma
		
	}
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int Array1[] = {1,2,3}, Array2[] = {3,2,1}; //Declaramos los arrays que vamos a sumar
		
		
		
		System.out.println("Array sumado: " + Arrays.toString(sumaArray(Array1,Array2)));
		//Mostramos la suma de los arrays
		
		

	}

}
