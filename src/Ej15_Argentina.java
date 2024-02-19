import java.util.*;

public class Ej15_Argentina {

/*Desarrolla el cuerpo de la siguiente función
*static void annadirEstrella (string seleccion, string estrellas)
*donde, en el caso de que los parámetros de entrada sean "Argentina" y "**"
*le añade una estrella a dicha selección y muestre el número de estrellas.	
*/	
	public static void ponerEstrella (String seleccion, String estrellas) {
		
		if (seleccion=="Argentina" && estrellas=="**") { //Ponemos la condicion
			
			System.out.println(seleccion + " ***"); //Si se cumple la condicion saldra el mensaje
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
	String seleccion="Argentina", estrellas="**"; //Declaramos las variables
	
	ponerEstrella (seleccion,estrellas);

	}

}
