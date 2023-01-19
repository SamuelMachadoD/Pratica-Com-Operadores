package com.samuel.praticaComOperadores.questao13;

import java.util.Scanner;

/*13. Tendo como dados de entrada a altura e o sexo de uma pessoa, 
 * construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * Para homens: (72.7*h) - 58
 * Para mulheres: (62.1*h) - 44.7 (h = altura)
 * Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso
 */
public class Questao13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double altura = 0;
		double pesoIdeal = 0;
		double pesoAtual = 0;
		String sexo;
		
		System.out.println("Digite seu sexo ( M - masculino, F - Feminino ) ");
		sexo = scan.nextLine();
		System.out.println("Digite sua altura em m: ");
		altura = scan.nextDouble();
		System.out.println("Digite seu peso atual em Kg: ");
		pesoAtual = scan.nextDouble();
		
		if(sexo.equals("M")) {
			
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal e: " + pesoIdeal + "Kg!");
			VerificaPeso(pesoIdeal, pesoAtual);
			
		}
		else if(sexo.equals("F")) {
			
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal e: " + pesoIdeal + "Kg!");
			VerificaPeso(pesoIdeal, pesoAtual);
			
		}
		else {
			System.out.println("Sexo digitado invalido!");
		}
		
	}
	
	public static void VerificaPeso(double pesoIdeal, double pesoAtual) {
		if(pesoAtual == pesoIdeal) {
			System.out.println("Voce esta no peso ideal!");
		}else if(pesoAtual < pesoIdeal) {
			System.out.println("Voce esta abaixo do peso ideal!");
		}else {
			System.out.println("Voce esta acima do peso ideal!");
		}
	}

}
