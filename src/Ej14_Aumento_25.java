import java.util.*;

public class Ej14_Aumento_25 {

/*Crea una tabla de 6 elementos rellena de números decimales. Aumentar cada uno de esos 
*elementos en un 25%.
*/
	public static void main(String[] args) {
		
	double array[] = {6.8,3.5,7.7,9.2,14.1,20.1}, array2[] = new double[6]; /*Declaramos el y le asignamos valores,
	                                                                         *tambien declaramos el array al que le 
	                                                                         *asignaremos la suma del 25% a los valores
	                                                                         */
	
	for (int i=0;i<array.length;i++) { //Recorremos el array
		
		array2[i] = array[i]+(array[i]*0.25); //A cada valor le sumamos un 25%
		
		
	}
	System.out.println(Arrays.toString(array2)); //Mostramos el nuevo array


	}

}
