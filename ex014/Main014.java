/*
Construa um algoritmo que peça a temperatura em graus Farenheit(ºF)
, transforme e mostre na tela a temperatura em graus Celsius(ºC). C=5*(F-32)/9}.
*/
import java.util.Scanner;

public class Main014
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Farenheit(ºF)");
        double Farenheit = scanner.nextDouble();
        
        double Celsius;
        
        Celsius = 5*(Farenheit - 32)/9;
        
        System.out.println("A temperatura de " + Farenheit + " Farenheit equivale a " + Celsius + " Celsius");
    }
}
