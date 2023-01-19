package com.samuel.praticaComOperadores.questao04;

import java.util.Scanner;

//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
public class Questao4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double notas = 0;
		double media;
		System.out.println("Digite as 4 notas de cada bimestre(aparte enter apos digitar cada): ");
		notas += scan.nextDouble();
		notas += scan.nextDouble();
		notas += scan.nextDouble();
		notas += scan.nextDouble();
		
		media = notas/4;
		
		System.out.println("A media do ano e : " + media);

	}

}
