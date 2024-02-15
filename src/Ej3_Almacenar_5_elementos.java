import java.util.*;

public class Ej3_Almacenar_5_elementos {

//Crear una función que pida por teclado 5 elementos y los almacene en una tabla	
	
	static int almacenaje (int array[]) {
		
    Scanner sc = new Scanner  (System.in);
		
	for (int i=0;i<array.length;i++) { //Con el for recorremos el array
		
	System.out.println("Introduce un valor");//Introducimos un valor en el índice correspondiente
	array[i]=sc.nextInt();
		
	}return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int array [] = new int [5];	//Declaramos el array
	
	almacenaje(array); //Llamamos a la función
	
	System.out.println(Arrays.toString(array)); //Mostramos los valores del array
		
		

	}

}
