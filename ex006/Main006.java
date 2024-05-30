// Calculando o ano que a pessoa nasceu

import java.util.Scanner;

public class Main006
{
    public static void main(String[] args){
        int anoAtual = 2024;
        int anoNasc;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a sua idade:");
        int idade = scanner.nextInt();

        anoNasc = anoAtual - idade;

        System.out.println("Voce nasceu no ano de " + anoNasc);
    }
}