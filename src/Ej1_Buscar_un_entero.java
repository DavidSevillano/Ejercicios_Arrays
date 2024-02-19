import java.util.*;

public class Ej1_Buscar_un_entero {

	/*Crea un método al que se le pase: una tabla rellena de enteros y un entero.
Habrá que buscar ese elemento en la tabla.*/
	
	public static void Busqueda (int array [], int entero) {
		
	int indice=0; //Declaramos el indice del array
	
	while(indice<array.length && array[indice]!=entero) { //Ponemos la condición
		indice++;                                                 //Vamos avanzando de posición
	} if (indice<array.length) {                                    //Se ha encontrado el entero
			System.out.println("El numero se encuentra en el array");
	}else {                                                          //No se ha encontrado el entero
		System.out.println("El numero no se encuentra en el array"); 
	}
	}
	/*Mientras que el indice sea menor que la longitud del array y el numero que se encuentre en ese indice 
	 *no sea el entero seguimos buscando
	 *Si el indice es menor a la longitud del array significa que se ha encontrado el entero
	 *Si el indice ha recorrido todo el array +1 significa que no esta tal entero en el array
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cuantos numeros quieres introducir en el array?"); //Preguntamos el índice del array
		int n = sc.nextInt();
		
		int tabla [] = new int[n];
		
		for (int i=0;i<tabla.length;i++) { //Recorremos el array
			
		System.out.println("Introduce un valor");
		tabla[i] = sc.nextInt();          //Añadimos un  valor al índice
			
		}
		System.out.println("Introduce el entero que quieras buscar"); //Preguntamos por el entero
		int entero = sc.nextInt();
		
		Busqueda(tabla,entero); //Llamamos a la función
		
	}

}
