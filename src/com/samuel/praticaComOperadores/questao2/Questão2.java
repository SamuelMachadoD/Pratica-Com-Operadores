package com.samuel.praticaComOperadores.questao2;

import java.util.Scanner;

//2. Faça um Programa que peça um número e então mostre a 
// mensagem O número informado foi [número].
public class Questão2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		
		numero = scan.nextInt();
		
		System.out.println("O numero digitado e : " + numero);

	}

}
