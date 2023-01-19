package com.samuel.praticaComOperadores.questao03;

import java.util.Scanner;

//3. Faça um Programa que peça dois números e imprima a soma.
public class Questao3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.println("Escreva o primeiro numero: ");
		valor1 = scan.nextInt();
		
		System.out.println("Escreva o segundo numero: ");
		valor2 = scan.nextInt();
		
		System.out.println("O valor somado dos valores e: " + (valor1 + valor2));

	}

}
