/*Construa um algoritmo que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.*/

import java.util.Scanner;

public class Main012
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Quantos você ganha por hora? ");
		double valor = scanner.nextDouble();
		
		System.out.println("Quantas horas voce trabalha no mes? ");
		double horas = scanner.nextDouble();
		
	    double salario = valor * horas;
		
		System.out.println("O seu salario no mes é de " + salario);
	}
}
