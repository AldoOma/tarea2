package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static BufferedReader Leer = new BufferedReader (new InputStreamReader(System.in)); 
	public static void main(String[] args) throws IOException {

		
		
		System.out.println("HOLA MUNDO");

		int opc;
		do {
			
			
			System.out.println("Bienvenido a su converidor de temperatura ");
			System.out.println("Ingrese la opcion 1 si desea convertir de Celcius a Farenheit ");
			System.out.println("Ingrese la opcion 2 si desea convertir de Farenheit a Celsius ");
			System.out.println("Ingrese la opcion 3 si desea convertir de Kelvin a Celsious ");
			System.out.println("Ingrese la opcion 4 si desea convertir de Farenheit a kelvin  ");
			System.out.println("Ingrese la opcion 5 si desea convertir de Kelvin a Farenheit ");
			int i = Integer.parseInt(Leer.readLine());
			
			switch (i) {
			
			case 1 : System.out.println("Hola");break;
			
			case 2 :System.out.println("Hola 2"); break;
			
			case 3 :System.out.println("Hola 3"); break;
			
			case 4 :System.out.println("Hola 4"); break;
			
			case 5 :System.out.println("Hola 5"); break;
		
			default : System.out.println("Error"); break;
			}
		
			System.out.println("Si desea salir ingrese 0 si desea continuar ingrese 1");
			 opc = Integer.parseInt(Leer.readLine());
			
			
			
		}while ( opc == 0);
	}

}
