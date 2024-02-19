import java.util.*;

public class Ej3_Almacenar_5_elementos {

//Crear una función que pida por teclado 5 elementos y los almacene en una tabla	
	
	public static int []Almacenaje (int array[]) {
		
    Scanner sc = new Scanner  (System.in);
		
	for (int i=0;i<array.length;i++) { //Con el for recorremos el array
		
	System.out.println("Introduce el " + (i+1) +"º"+ " valor del array");
	array[i]=sc.nextInt(); //Introducimos un valor en el índice correspondiente
		
	}return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int array [] = new int [5];	//Declaramos el array
	
	System.out.println(Arrays.toString(Almacenaje(array))); /*Mostramos los valores del array
	                                                         *llamando a la funcion
	                                                         */
	                                                      
		
		

	}

}
