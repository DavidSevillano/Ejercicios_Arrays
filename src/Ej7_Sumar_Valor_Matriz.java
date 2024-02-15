import java.lang.reflect.Array;
import java.util.*;

public class Ej7_Sumar_Valor_Matriz {
	
/*Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en
 * otra matriz nxm.
 */
	
    static int Asignar(int Matriz[][],int longitud) {
    	
    	Scanner sc = new Scanner (System.in);
    	
    	
    	
    	for (int i=0;i<longitud;i++){
    		
    	
    		for(int j=0;j<longitud;j++) {
  
    		System.out.println("Introduce un valor para la matriz");
    		Matriz[i][j]=sc.nextInt();
    		
    		}}return 0;
    	
    }

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
	Scanner sc = new Scanner (System.in);
		
	System.out.println("Que longitud quieres en las matrices?");
	int n=sc.nextInt();
	
	int matriz1[][], matriz2[][], matriz3[][];
	matriz1 = new int [n][n];
	matriz2 = new int [n][n];
	matriz3 = new int [n][n];
	Asignar(matriz1,n);
	Asignar(matriz2,n);
	
	for (int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			
			matriz3[i][j] = matriz1 [i][j] + matriz2 [i][j];
			
		}
	}System.out.println("El resultado es " + Arrays.deepToString(matriz3));
	
	
	
	
	
	
	

	}

}
