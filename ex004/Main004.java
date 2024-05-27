// Perguntando idade, primeira letra do nome, e altura e imprimindo na tela

import java.util.Scanner;

public class Main004
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Por favor, insira sua idade: ");
    int valor = scanner.nextInt();
    
    scanner.nextLine();

    System.out.print("Por favor, insira a primeira letra do seu nome: ");
    String pLetra = scanner.nextLine();

    System.out.print("Por favor, insira sua altura: ");
    double altura = scanner.nextDouble();

    System.out.println("Sua idade é " + valor);
    System.out.println("A primeira letra do seu nome é: " + pLetra);
    System.out.println("Sua altura é de: " + altura);
    
    scanner.close();
  }
}