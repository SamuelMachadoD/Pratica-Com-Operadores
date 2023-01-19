package com.samuel.praticaComOperadores.questao6;

import java.util.Scanner;

//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
public class Questao6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double raioDoCirculo = 0;
		double areaDoCirculo = 0;
		
		System.out.println("Digite o raio do circulo: ");
		raioDoCirculo = scan.nextDouble();
		
		areaDoCirculo = Math.PI * Math.pow(raioDoCirculo, 2);
		
		System.out.println("A area do circulo e igual a = " + areaDoCirculo);
	}

}
