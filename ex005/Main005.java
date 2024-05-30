// Calculando a area de um circulo

import java.util.Scanner;

public class Main005
{
    public static void main(String[] args)
    {
        double pi;
        double area;

        pi = 3.1415;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio do circulo: ");
        double raio = scanner.nextDouble();

        area = pi * (raio * raio);

        System.out.println("A area do circulo é: " + area);

    }
}