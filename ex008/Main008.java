//Construa um algoritmo que peça um número com 5 casas decimais e arredonde para duas.

import java.text.DecimalFormat; 
import java.util.Scanner;

public class Main008
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Digite um numero com 5 casas decimais: ");
		double numero = scanner.nextDouble();
		
		System.out.println(new DecimalFormat("#,##0.00").format(numero));
	}
}
