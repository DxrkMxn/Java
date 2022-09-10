package talleres;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args){
		
        String nombrepersona;
        String cedulapersona;
        String telefonopersona;
        

        Scanner teclado = new Scanner(System.in);

   
        
        System.out.print("Introduzca el nombre de la persona");
        nombrepersona = teclado.nextLine(); 

        System.out.print("Introduzca el telefono de la persona ");
        telefonopersona = teclado.nextLine(); 

        System.out.print("Introduzca el cedula  de la persona ");
        cedulapersona = teclado.nextLine();
        
        
    }
	
}
