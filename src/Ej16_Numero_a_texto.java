import java.util.*;

public class Ej16_Numero_a_texto {

/*Crear una función a la que se le pase un número y devuelva dicho número
*escrito en texto. Hacerlo para tres o cuatro números solamente.	
*/
	public static String numeroTexto (int numero) {
		
    String unidades[] = {"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
	String unicos [] = {"Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete",
			"Dieciocho","Diecinueve"};
    String decenas [] = {"","","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
    /*Declaramos 3 variables, una para las unidades, otra para las decenas y otra para los casos unicos,
     *(Hay que asgurarse de que el 0 coincida con la posicion cero, el 1 con el 1 etc, mismo caso para el 
     *20[2] 19[9] etc.)
     */
    
     if (numero>=0&&numero<=9) { //Si el numero esta entre el 0 y el 9 devolvemos la unidad correspondiente
    	 return unidades[numero];
     }else if (numero>=10&&numero<=19) {/*Si el numero esta entre el 10 y el 19 devolvemos el numero unico 
                                         *correspondiente
                                         */
    	 return unicos[numero-10];
     }else if (numero==20||numero==30||numero==40||numero==50|| //Si el numero es cualquiera de estos devolvemos
    		    numero==60||numero==70||numero==80||numero==90) {  //solo las decenas                                               
    		                                                    
    	 return decenas[numero/10];
     }else if (numero>=20&&numero<=99&&(numero!=20||numero!=30||numero!=40||numero!=50|| 
    		    numero!=60||numero!=70||numero!=80||numero!=90)) {//Si el numero esta entre el 19 y el 99 y no es
    	 return decenas[numero/10]+(" y "+ unidades[numero%10]);  //ninguna de las decenas anteriores devolvemos decenas y unidades
     }else {
    	 return ("No es valido"); //Si no es ninguno de los anteriores casos devolvemos un mensaje de error
     }
    	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		int n1=12, n2=76, n3=20, n4=1; //Declaramos los numeros (Suponemos que es del 0 al 99)
		
		
		//Llamamos a la funcion para cada numero
		System.out.println(numeroTexto(n1));
		System.out.println(numeroTexto(n2));
		System.out.println(numeroTexto(n3));
		System.out.println(numeroTexto(n4));
		

	}

}
