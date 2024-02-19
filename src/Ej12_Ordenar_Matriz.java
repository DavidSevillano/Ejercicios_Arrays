import java.util.*;
	
public class Ej12_Ordenar_Matriz {
//Ordenar todos los elementos de una matriz de izquierda a derecha y de arriba a abajo.	
	
	
	
	public static void main (String[]args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduce la dimension de la matriz");
	int n=sc.nextInt();
		
	int matriz[][] = new int [n][n];
	
	for (int i=0;i<matriz.length;i++) { //Introducimos los valores a la matriz
		for (int j=0;j<matriz.length;j++) {
			
			System.out.println("Introduce un valor para la " + (i+1)+ "º fila y la " + (j+1) + "º columna");
			matriz[i][j] = sc.nextInt();
			
			
		}
	}int indicearray=0, longitud=matriz.length, arrayordenar[] = new int [longitud*longitud];/*Declaramos un array para almacenar todos
	                                                                                          *los valores de la matriz y poder ordenarlos
	                                                                                          */
	    for (int i=0;i<longitud;i++) {
		    for (int j=0;j<longitud;j++) {
		        
		    arrayordenar[indicearray++] = matriz[i][j]; /*Vamos almacenando los valores de la matriz en cada indice del array
		                                                 *(Esa es la importancia del ++, gracias a lo cual vamos avanzando de indice)
		                                                 */
		    
		    	
		    }
		}
	    indicearray=0; //Reseteamos el indice
	    Arrays.sort(arrayordenar); //Ordenamos el array
	    int matriz2 [][]= new int [longitud][longitud]; //Declaramos la nueva matriz ordenada
	    
	        for (int i=0;i<longitud;i++) {
		        for (int j=0;j<longitud;j++) {
		        	
		        matriz2[i][j]=arrayordenar[indicearray++]; //Vamos añadiendo los valores a la matriz
		        	
		        }
		    }
	    
	    System.out.println(Arrays.deepToString(matriz2)); //Mostramos la nueva matriz
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	