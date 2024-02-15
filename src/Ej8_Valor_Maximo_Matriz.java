import java.util.*;

public class Ej8_Valor_Maximo_Matriz {
	
//Devuelve el valor máximo de un array bidimensional que se pasa como parámetro.
	
	static int VMmatriz (int matriz [][]) {
		
	int maximo=-1;//Declaramos un valor máximo
	
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
			
			if (matriz[i][j]>maximo) {
				
				maximo=matriz[i][j];
				
			}
			
		}
		
	}System.out.println("El valor máximo es " + maximo);
	return maximo;
		
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduce la longitud");//Pedimos la longitud de la matriz
	int n = sc.nextInt();
	
	int matriz [][] = new int [n] [n];
	
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
			
			System.out.println("Introduce un valor");//Vamos introduciendo valores
			matriz [i][j] = sc.nextInt();
			
		}
	}
	
	VMmatriz(matriz);
		

	}

}
