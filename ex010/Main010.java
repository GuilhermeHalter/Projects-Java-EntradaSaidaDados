//Construa um algoritmo que peça dois números, calcule e mostre a soma dos mesmos 

import java.util.Scanner;

public class Main010
{
	public static void main(String[] args) {
	    
	  Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite o valor do primeiro numero: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite o valor do segundo numero: ");
		double n2 = scanner.nextDouble();
		
	  double soma = n1 + n2;
		
		System.out.println("A soma dos numeros " + n1 +" "+ n2 + " é " + soma);
	}
}
