/*
Construa um algoritmo que peça 2 números inteiros e um número real. Calcule e mostre:

⦁	o produto do dobro do primeiro com metade do segundo .
⦁	a soma do triplo do primeiro com o terceiro.
⦁	o terceiro elevado ao cubo
*/

import java.util.Scanner;

public class Main016
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        int inteiro1 = scanner.nextInt();
        
        System.out.println("Digite outro numero inteiro: ");
        int inteiro2 = scanner.nextInt();
        
        System.out.println("Digite um numero real: ");
        double real = scanner.nextDouble();
        
        int questao1 = (2 * inteiro1) * (inteiro2/2);
        
        double questao2 = (3 * inteiro1) + real;
        
        double questao3 = real * real * real;
        
        System.out.println("O produto do dobro do primeiro com metade do segundo eh: " + questao1);
        System.out.println("A soma do triplo do primeiro com o terceiro eh: " + questao2);
        System.out.println("O terceiro elevado ao cubo eh: " + questao3);
    }
}
