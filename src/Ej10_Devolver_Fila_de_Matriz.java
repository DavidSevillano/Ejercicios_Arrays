import java.util.*;

public class Ej10_Devolver_Fila_de_Matriz {

//Devuelve una fila (array unidimensional) de un array bidimensiona que se pasa como parámetro.	
	
	static int Fila (int matriz [][], int fila) {
		
	int array[] = new int [matriz.length];	//Declaramos un array que sera la fila que se mostrara
	
	for (int i=0; i<matriz.length;i++) {
		for (int j=0; j<matriz.length;j++) { //Recorremos la matriz
			
			if(i==fila) {               
				array[j]=matriz[i][j]; /*Si el valor de i es el mismo que el de fila almacenamos los valores
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
		System.out.println("Que fila quieres ver?");//Pedimos la fila que mostrar
		int f=sc.nextInt();
		
		Fila(matriz,f);
		
		

	}

}
