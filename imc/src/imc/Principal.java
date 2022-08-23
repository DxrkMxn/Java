package imc;
import java.util.Scanner;



import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String scan = scanner.next();
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Introduce tu sexo (H o M): ");
        char sexo = scanner.next().charAt(0);
        System.out.println("Introduce tu peso (KG) (usar coma): ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura (Metros) (usar coma): ");
        double altura = scanner.nextDouble();
        
        double imc = (peso / ( altura * altura ));

        Persona usuario = new Persona (scan, edad, sexo, peso, altura);    
       
        System.out.println("La persona: ");
        System.out.println(usuario);
        System.out.println("Tiene un IMC de: ");
        System.out.println(imc);

        if (imc < 18.5) {
        	System.out.println("Insuficiencia ponderada");
        }
        else if (imc < 25) {
        	System.out.println("Intervalo normal");
        }
        else if (imc < 30) {
        	System.out.println("Sobrepeso");
        }
        else if (imc < 35) {
        	System.out.println("Obesidad Clase 1");
        }
        else if (imc < 40) {
        	System.out.println("Obesidad Clase 2");
        }
        else {
        	System.out.println("Obesidad Clase 3");
        }
        
    }
}