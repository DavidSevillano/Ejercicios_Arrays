import java.util.*;

public class Ej11_Devolver_Columna_de_Matriz {
	
//Devuelve una columna (array unidimensional) de un array bidimensional que se pasa como parámetro.
	
	public static int []Columna (int matriz [][], int columna) {
		
	int array[] = new int [matriz.length];	//Declaramos un array que sera la fila que se mostrara
	
	for (int i=0; i<matriz.length;i++) {
		for (int j=0; j<matriz.length;j++) { //Recorremos la matriz
			
			if(j==(columna-1)) {               
				array[i]=matriz[i][j];  /*Si el valor de j es el mismo que el de la columna
				                         *almacenamos los valores en el array
				                         *(Ponemos -1 ya que las filas y columnas siempre
				                         *empiezan desde el cero y hemos pedido "La fila" que
				                         *quiere ver, por lo que presuponemos que empezara
				                         *a contar desde la 1ª columna
				                         */
			}
		}	
		}
    return array;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la dimension de la matriz"); //Pedimos la longitud de la matriz
		int n = sc.nextInt();
		
		int matriz [][] = new int [n][n];
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz.length;j++) {
				
				System.out.println("Introduce un valor para la " + (i+1)+ " fila y "+ (j+1)
						+ " columna"); //Añadimos valores
				matriz[i][j] = sc.nextInt();	
				
			}
		}
		System.out.println("Que columna quieres ver? (tienes " + matriz.length + " columnas)");//Pedimos la columna que queremos mostrar
		int c=sc.nextInt();
		
		System.out.println("Los valores de la columna son: " +
		Arrays.toString(Columna(matriz,c))); //Mostramos los valores del array
 


	}

}
