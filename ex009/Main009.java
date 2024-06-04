//Construa um algoritmo que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Main009
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = scanner.nextDouble();
		
	    double area = lado * lado;
		
		System.out.println("A area de um quadrado com lado " + lado + " é de " + area + " e o dobro dessa area é de " + area * 2);
	}
}
