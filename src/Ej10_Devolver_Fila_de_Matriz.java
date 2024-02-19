import java.util.*;

public class Ej10_Devolver_Fila_de_Matriz {

//Devuelve una fila (array unidimensional) de un array bidimensional que se pasa como parámetro.	
	
	public static int []Fila (int matriz [][], int fila) {
		
	int array[] = new int [matriz.length];	//Declaramos un array que sera la fila que se mostrara
	
	for (int i=0; i<matriz.length;i++) {
		for (int j=0; j<matriz.length;j++) { //Recorremos la matriz
			
			if(i==(fila-1)) {               
				array[j]=matriz[i][j]; /*Si el valor de i es el mismo que el de fila que pedimos
				                         *almacenamos los valores en el array
				                         *(Ponemos -1 ya que las filas y columnas siempre
				                         *empiezan desde el cero y hemos pedido "La fila" que
				                         *quiere ver, por lo que presuponemos que empezara
				                         *a contar desde la 1ª fila
				                         */
			}
		}	
		}
    return array; //Devolvemos el array
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la dimension de la matriz"); //Pedimos la longitud de la matriz
		int n = sc.nextInt();
		
		int matriz [][] = new int [n][n];
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz.length;j++) {
				
				System.out.println("Introduce un valor para la " + (i+1)+ " fila y "+ (j+1) //Añadimos valores
						+ " columna"); 
				matriz[i][j] = sc.nextInt();	
				
			}
		}
		System.out.println("Que fila quieres ver? (tienes " + matriz.length + " filas)");//Pedimos la fila que queremos mostrar
		int f=sc.nextInt();
		
		System.out.println("Los valores de la fila son: " + 
		Arrays.toString(Fila(matriz,f))); //Mostramos los valores del array

		
		

	}

}
