//Construa um algoritmo que peça as 4 notas bimestrais e mostre a média, com uma casa decimal  

import java.util.Scanner;

public class Main011
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite o valor da primeira nota: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite o valor da segunda nota: ");
		double n2 = scanner.nextDouble();
		
		System.out.println("Digite o valor da terceira nota: ");
		double n3 = scanner.nextDouble();
		
		System.out.println("Digite o valor do quarta nota: ");
		double n4 = scanner.nextDouble();
		
	    double soma = n1 + n2 + n3 + n4;
	    double media = soma / 4;
		
		System.out.println("A media das notas é " + media);
	}
}
