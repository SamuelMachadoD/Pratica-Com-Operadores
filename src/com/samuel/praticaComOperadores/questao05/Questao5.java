package com.samuel.praticaComOperadores.questao05;

import java.util.Scanner;

//5. Faça um Programa que converta metros para centímetros.
public class Questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor em m : ");
		double metros = scan.nextDouble();
		
		double centimetros = metros*100;
		
		System.out.println(centimetros + "cm");

	}

}
