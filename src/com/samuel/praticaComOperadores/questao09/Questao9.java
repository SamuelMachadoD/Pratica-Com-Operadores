package com.samuel.praticaComOperadores.questao09;

import java.util.Scanner;

/* 9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius. */
//C = (F-32) * 5 / 9).
public class Questao9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double temperaturaFarenheit = 0;
		double temperaturaCelsius = 0;
		
		System.out.println("Digite a temperatura em Farenheit: ");
		temperaturaFarenheit = scan.nextDouble();
		temperaturaCelsius = (temperaturaFarenheit - 32) * 5 / 9;
		
		System.out.println("A temperatura digitada em Celsius e : " + temperaturaCelsius);
		
		

	}

}
