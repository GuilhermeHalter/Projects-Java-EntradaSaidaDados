/*
Construa um algoritmo que peça uma temperatura em graus Celsius(ºC), 
transforme e mostre na tela a temperatura em graus Farenheit(ºF).
*/

import java.util.Scanner;

public class Main015
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius(ºC)");
        double Celsius = scanner.nextDouble();
        
        double Farenheit;
        
        Farenheit = (Celsius * 1.8) + 32; 
        
        System.out.println("A temperatura de " + Celsius + " Celsius equivale a " + Farenheit + " Farenheit");
        
    }
}
