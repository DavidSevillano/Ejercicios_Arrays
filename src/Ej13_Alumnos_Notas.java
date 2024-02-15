import java.util.*;

public class Ej13_Alumnos_Notas {
	
/*Crear dos tablas con misma longitud. En una almacenar los nombres de una serie de alumnos, y en otra,
 *  sus notas de Programación. Devolver el nombre del alumno/a con mayor nota.	
 */
	
	
	static String MayorNota (String nombres[], int notas[]) {
	
	String mayornombre="";
	int mayornota=0, nota=0;
		
	for (int i=0;i<nombres.length;i++) {
		
		if (notas[i]>nota) {
			
			nota=notas[i];
			mayornombre=nombres[i];
			mayornota=notas[i];
			
		}	
		
	}System.out.println("La persona con mejor nota es: " + mayornombre + " con un: " + mayornota);
	return mayornombre;
		
		
		
	}

	public static void main(String[]args) {
			
	String nombres[] = {"Manuel", "Lucia", "Juan", "Marta"};
	int notas[] = {7,10,6,4};
	
	MayorNota(nombres,notas);
	
	
	
		
		
		
		
	}

}
