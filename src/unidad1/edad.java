package unidad1;

import java.time.LocalDate;
import java.util.Scanner;

public class edad {

	public static void main(String[] args) {
		// establecemos el escaner para que lea la fecha de nacimiento y lo almacene en la variable 
	Scanner teclado= new Scanner (System.in);
	// almacenamos en la variable, pidiendole el a�o actual al sistema
	int a�oactual  =LocalDate.now().getYear();
	
	System.out.println("introduzca su a�o de nacimiento ");
	int nacimiento= teclado.nextInt();
	teclado.nextLine();
	//restamos a�o autual con la fecha de nacimiento
	int edad=a�oactual - nacimiento;
	// establecemos la condicion que si la fecha de nacimiento es mayor a la a�o actual no se mostrara la edad ya que seria negativo el resultado
	if (a�oactual > nacimiento) {System.out.println("se edad es   " +edad);}
	
	else  {System.out.println("vuelva a insertar su fecha de naciomento, los datos aportados son erroneos");}
	
	
	
	
	
	
	
	teclado.close();
	

	}
	
}
