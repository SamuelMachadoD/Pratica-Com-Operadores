package com.samuel.praticaComOperadores.questao12;

import java.util.Scanner;

/*12. Tendo como dados de entrada a altura de uma pessoa, 
 * construa um logoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
 * (72.7*altura) - 58
 * */
public class Questao12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double altura = 0;
		double pesoIdeal = 0;
		
		System.out.println("Digite sua altura em m: ");
		altura = scan.nextDouble();
		
		pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal e: " + pesoIdeal + "Kg!");

	}

}
