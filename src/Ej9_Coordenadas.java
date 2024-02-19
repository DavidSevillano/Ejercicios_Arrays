import java.util.*;

public class Ej9_Coordenadas {

/*Función a la que se le pase una matriz bidimensional, unas coordenadas y devuelva el elemento
 * que contiene en esa posición.	
 */
	public static int Coordenadas (int matriz[][], int coordenadax, int coordenaday) {
    
	if (coordenadax-1 > matriz.length || coordenaday-1 > matriz.length){   //Si la fila o columna que
		System.out.println("Las coordenadas introducidas no son validas"); /*hemos introducido es mayor
		                                                                    *a la longitud de la matriz
		                                                                    *saltara un mensaje de error
		                                                                    *(Debe ser -1 ya que las filas
		                                                                    *y columnas empiezan por 0
		                                                                    */
	}
	
	
	
	return matriz[coordenadax-1][coordenaday-1]; //Devolvemos el valor	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
	Scanner sc = new Scanner (System.in);
		
	System.out.println("Introduce la longitud");//Pedimos la longitud
	int n = sc.nextInt();
		
	int matriz [][] = new int [n] [n];
		
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
				
			System.out.println("Introduce un valor");//Vamos introduciendo valores
			matriz [i][j] = sc.nextInt();
				
		}
	}System.out.println("Introduce la fila"); //Pedimos la fila en la que se encuentra el valor
	int x=sc.nextInt();
	
	System.out.println("Introduce la columna"); //Pedimos la columna en la que se encuentra el valor
	int y=sc.nextInt();
	
	System.out.println("El valor es " + Coordenadas (matriz,x,y));
	

			
		
		
		
		
		

	}

}
