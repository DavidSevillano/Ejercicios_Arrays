import java.util.*;

public class Ej8_Valor_Maximo_Matriz {
	
//Devuelve el valor máximo de un array bidimensional que se pasa como parámetro.
	
	public static int valorMaximoMatriz (int matriz [][]) {
		
	int maximo=0;//Declaramos un valor máximo
	
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
			
			if (i==0&&j==0) { //Almacenamos el primer valor como máximo ya que no hay ninguno anterior
				
				maximo=matriz[i][j];
				
			}else if(matriz[i][j]>maximo) { //Si un valor es mayor al máximo anterior lo almacenamos
				maximo=matriz[i][j];
			}
			
		}
		
	}
	return maximo;
		
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduce la dimension de la matriz");//Pedimos la longitud de la matriz
	int n = sc.nextInt();
	
	int matriz [][] = new int [n] [n]; //Le asignamos la longitud
	
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
			
			System.out.println("Introduce un valor para la " + (i+1)+ " fila y "+ (j+1)+ " columna");
			matriz [i][j] = sc.nextInt(); //Vamos introduciendo valores
			
		}
	}
	
	System.out.println("El valor máximo es " + valorMaximoMatriz(matriz)); //Mostramos por pantalla el resultado

		

	}

}
