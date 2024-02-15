import java.util.*;

public class Ej11_Devolver_Columna_de_Matriz {
	
//Devuelve una columna (array unidimensional) de un array bidimensional que se pasa como parámetro.
	
	static int Columna (int matriz [][], int columna) {
		
	int array[] = new int [matriz.length];	//Declaramos un array que sera la fila que se mostrara
	
	for (int i=0; i<matriz.length;i++) {
		for (int j=0; j<matriz.length;j++) { //Recorremos la matriz
			
			if(j==columna) {               
				array[i]=matriz[i][j]; /*Si el valor de j es el mismo que el de fila almacenamos los valores
				                         *en el array
				                         */
			}
		}	
		}
	System.out.println("Los valores de la fila son: " + Arrays.toString(array)); //Mostramos los valores del array
    return 0;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la longitud de la matriz"); //Pedimos la longitud de la matriz
		int n = sc.nextInt();
		
		int matriz [][] = new int [n][n];
		
		for (int i=0; i<matriz.length;i++) {
			for (int j=0; j<matriz.length;j++) {
				
			System.out.println("Introduce un valor para la fila "+ i + " columna "+ j); //Añadimos valores
				matriz[i][j] = sc.nextInt();	
				
			}
		}
		System.out.println("Que columna quieres ver?");//Pedimos la fila que mostrar
		int c=sc.nextInt();
		
		Columna(matriz,c);

	}

}
