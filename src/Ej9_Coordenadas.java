import java.util.*;

public class Ej9_Coordenadas {

/*Función a la que se le pase una matriz bidimensional, unas coordenadas y devuelva el elemento
 * que contiene en esa posición.	
 */
	static int Coordenadas (int matriz[][], int coordenadax, int coordenaday) {
    
	if (coordenadax > matriz.length || coordenaday > matriz.length){ 
		System.out.println("Las coordenadas introducidas no son validas");
	}
	
	
	System.out.println("El valor es " + matriz[coordenadax][coordenaday]);
	return matriz[coordenadax][coordenaday];	
		
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
	}System.out.println("Introduce la coordenada x");//Pedimos 
	int x=sc.nextInt();
	
	System.out.println("Introduce la coordenada y");
	int y=sc.nextInt();
	
	Coordenadas (matriz,x,y);
			
		
		
		
		
		

	}

}
