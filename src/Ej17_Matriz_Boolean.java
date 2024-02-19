import java.util.*;

public class Ej17_Matriz_Boolean {

//Crear una tabla rellena de tres tablas de booleans.	
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
	boolean uno[] = {true,false,true}, dos[] = {false,true,false}, tres[] = {true,true,false};
	boolean matriz[][] = new boolean [3][3];
	
	for (int i=0;i<matriz.length;i++) {
		for(int j=0;j<matriz.length;j++) {
			
			if (i==0) {
				matriz[i][j]=uno[j]; //En la primera fila asignamos los valores del 1º Array
			}else if (i==1) {
				matriz[i][j]=dos[j]; //En la segunda fila asignamos los valores del 2º Array
			}else {
				matriz[i][j]=tres[j]; //En la ultima fila asignamos los valores del 3º Array
			}
			
			
		}
	}System.out.println(Arrays.deepToString(matriz)); //Mostramos la matriz
	

	
	
		

	}

}
