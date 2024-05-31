//transformando metros para centimetros

import java.util.Scanner;

public class Main007 {
    public static void main(String[] args){
        
        double centimetros = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de metros: ");
        double metros = scanner.nextDouble();

        System.out.println("O valor de " + metros + " metros em centimetros é: " + metros * centimetros + " cm");
    }
}