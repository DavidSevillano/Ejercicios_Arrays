import java.util.*;

public class Ej13_Alumnos_Notas {
	
/*Crear dos tablas con misma longitud. En una almacenar los nombres de una serie de alumnos, y en otra,
 *  sus notas de Programación. Devolver el nombre del alumno/a con mayor nota.	
 */
	
	
	public static String mayorNota (String nombres[], int notas[]) {
	
	String mayornombre=""; //Declaramos un String vacio, el cual sera el nombre de la persona con mayor nota
	int mayornota=0;
		
	for (int i=0;i<nombres.length;i++) {
		
		if (i==0) { //Si es la primera nota asignamos el nombre y la nota
			mayornota=notas[i];
			mayornombre=nombres[i];
		}else if (notas[i]>mayornota) { //Si la nota es mayor que la anterior mejor nota actualizamos las variables
			mayornombre=nombres[i];
			mayornota=notas[i];
			
		}	
		
	}return mayornombre;
		
		
		
	}

	public static void main(String[]args) {
			
	String nombres[] = {"Manuel", "Lucia", "Juan", "Marta"}; //Declaramos el array con los nombres
	int notas[] = {7,10,6,4}; //Declaramos el array con las notas
	
	System.out.println("La persona con mejor nota es: " + mayorNota(nombres,notas)); //Llamamos a la variable
	
	
	
	
		
		
		
		
	}

}
