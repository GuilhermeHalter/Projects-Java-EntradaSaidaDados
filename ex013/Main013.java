/*
Uma firma contrata um encanador a 25,00 por dia. 
Crie um programa que solicite o número de dias trabalhados
pelo encanador e imprima a quantia líquida que deverá ser paga, 
sabendo-se que são descontados 8% para o Imposto de Renda.
*/

import java.util.Scanner;

public class Main013
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double contrataPorDia = 25.00;
        double impostoRenda = 0.08;
        
        System.out.println("Quantos dias trabalhados ?");
        double numeroDias = scanner.nextDouble(); 
        
        double salario = numeroDias * contrataPorDia;
        double descontoSalario = salario - (salario * impostoRenda);
        
        System.out.println("O valor do salario com desconto eh de " + descontoSalario);
    }
}
