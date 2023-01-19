package com.samuel.praticaComOperadores.questao07;

import java.util.Scanner;

//7. Faça um Programa que calcule a área de um quadrado, em seguida 
// mostre o dobro desta área para o usuário
public class Questao7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		double areaDoQuadrado = 0;
		
		System.out.println("Digite o valor da largura ou altura do quadrado : ");
		areaDoQuadrado = scan.nextDouble();
		
		areaDoQuadrado = Math.pow(areaDoQuadrado, 2) * 2;
		
		System.out.println("A area do quadrado*2 = " + areaDoQuadrado);

	}

}
