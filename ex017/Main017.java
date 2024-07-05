/*
Uma determinada empresa vende uma máquina que possui seis motores. Um de 20 CV, dois de 1 CV, e três de 5 CV, que custam 1500, 300 e 600 reais respectivamente cada motor. Existe a necessidade de saber quantos motores deverão ser comprados de cada modelo e quanto custará esta compra. Para isto elabore um programa que: 

⦁	Pergunte quantas máquinas serão vendidas; 
⦁	Calcule e apresente na tela a quantidade de motores que deverão ser comprados de cada modelo; 
⦁	Calcule e apresente na tela o custo total por máquina, o custo por tipo de motor e o custo total da compra.
*/

import java.util.Scanner;

public class Main017
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int motorVinte, motorUm, motorCinco;
        
        float valorMaquina, valorMotorVinte, valorMotorUm, valorMotorCinco, valorTotal;
        
        System.out.println("Informe a quantidade de maquinas a serem compradas:  ");
        int numMaquina = scanner.nextInt();
        
        valorMaquina = (1500 + (600*3) + (300*2)); 
        
        motorVinte = 1 * numMaquina;
        motorUm    = 2 * numMaquina;
        motorCinco = 3 * numMaquina;
        
        valorMotorVinte = motorVinte * 1500;
        valorMotorUm = motorUm * 300;
        valorMotorCinco = motorCinco * 600;
        
        valorTotal = valorMotorVinte + valorMotorUm + valorMotorCinco;
        
        System.out.println("O numero de motores 20CV que deverao ser comprados são de: " + motorVinte);
        System.out.println("O numero de motores 1CV que deverao ser comprados são de: " + motorUm);
        System.out.println("O numero de motores 5CV que deverao ser comprados são de: " + motorCinco);

        System.out.println("O valor a pagar de 1 maquina eh de "+ valorMaquina);
        
        System.out.println("O valor a pagar nos motores 20CV é de " + valorMotorVinte);
        System.out.println("O valor a pagar nos motores 1CV é de " + valorMotorUm);
        System.out.println("O valor a pagar nos motores 5CV é de " + valorMotorCinco);
        
        System.out.println("O valor total a pagar eh de " + valorTotal);
    }
}
