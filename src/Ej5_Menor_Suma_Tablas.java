import java.util.*;

public class Ej5_Menor_Suma_Tablas {
	
//Crear una función a la que se le pasen dos tablas y nos diga cuál contiene una menor suma de sus elementos
	
	public static void menorSuma (int a[], int b[]) {
		
	int suma1=0, suma2=0; //Declaramos las variables para las sumas
	
	for(int i:a) {//Para conocer la suma de los valores del array usamos un for-each
		
		suma1+=i;		
	}for (int i:b) {//Segundo for-each
		
		suma2+=i;
	}if (suma1>suma2) {
		System.out.println("El segundo array contiene una menor suma, array 2 = "+ suma2 + " array 1 = "+ suma1);
	}else if (suma2>suma1) {
		System.out.println("El primer array contiene una menor suma, array 1 = "+ suma1 + " array 2 = "+ suma2);
	}else {
		System.out.println("Los dos arrays tienen el mismo valor: "+ suma1);
	}
	//Ponemos las condiciones correspondientes y terminamos la funcion
		
		
	}

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int array1[] = new int [5], array2[] = new int [5]; //Declaramos los arrays
	
	for (int i=0; i<array1.length;i++) {//Recorremos los arrays para asignarle valores
		
		System.out.println("Introduce el " + (i+1) +"º"+ " valor para el primer Array");
		array1[i]=sc.nextInt();
		
	}for (int i=0;i<array2.length;i++) {//Recorremos el segundo array
		
		System.out.println("Introduce el " + (i+1) +"º"+ " valor para el segundo Array");
		array2[i]=sc.nextInt();		
	}
	menorSuma(array1,array2);//Llamamos a la funcion

	}

}
