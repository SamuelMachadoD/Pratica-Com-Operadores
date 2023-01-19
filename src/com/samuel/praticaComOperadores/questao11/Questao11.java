package com.samuel.praticaComOperadores.questao11;

import java.util.Scanner;

//11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a. O produto do dobro do primeiro com metade do segundo
//b. A soma do triplo do primeiro com o terceiro
//c. O terceiro elevado ao cubo
public class Questao11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inteiro1 = 0;
		int inteiro2 = 0;
		double real = 0;
		
		double calculoA = 0;
		double calculoB = 0;
		double calculoC = 0;
		
		System.out.println("Escreva o primeiro numero inteiro: ");
		inteiro1 = scan.nextInt();
		
		System.out.println("Escreva o segundo numero inteiro: ");
		inteiro2 = scan.nextInt();
		
		System.out.println("Escreva o numero real: ");
		real = scan.nextDouble();
		
		calculoA = (inteiro1 * 2) * (inteiro2 / 2);
		calculoB = (inteiro1 * 3) + real;
		calculoC = Math.pow(real, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo = " + calculoA);
		System.out.println("A soma do triplo do primeiro com o terceiro = " + calculoB);
		System.out.println("O terceiro elevado ao cubo = " + calculoC);
	}

}
