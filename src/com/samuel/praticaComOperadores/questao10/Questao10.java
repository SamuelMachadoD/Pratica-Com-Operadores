package com.samuel.praticaComOperadores.questao10;

import java.util.Scanner;

/* 10. Faça um Programa que peça a temperatura em graus Celsius, 
transforme e mostre em graus Farenheit. */
public class Questao10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double temperaturaFarenheit = 0;
		double temperaturaCelsius = 0;
		
		System.out.println("Digite a temperatura em Celsius: ");
		temperaturaCelsius = scan.nextDouble();
		temperaturaFarenheit = (temperaturaCelsius * 9 / 5 ) + 32;
		
		System.out.println("A temperatura digitada em Farenheit e : " + temperaturaFarenheit);

	}

}
