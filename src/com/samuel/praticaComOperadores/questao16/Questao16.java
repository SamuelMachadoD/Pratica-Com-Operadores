package com.samuel.praticaComOperadores.questao16;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*16. Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.*/
public class Questao16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double baldes = 0;
		double litrosDeTinta = 0;
		double precoTotal = 0;
		double metros2 = 0;
		
		System.out.println("Quantos metros quadrados serao pintados?");
		metros2 = scan.nextDouble();
		
		litrosDeTinta = metros2 / 3;
		
		if(litrosDeTinta >= 18) {
			baldes = Math.ceil(litrosDeTinta / 18); //Math.ceil arrendonda qualquer numero decimal para cima.
			precoTotal = 80 * baldes;
		}else {
			baldes = 1;
			precoTotal = 80;
		}

		System.out.println("Voce vai precisar de " + litrosDeTinta + " Litros de tinta!");
		System.out.println("Equivalente a " + baldes + " baldes de tinta!");
		System.out.println("O valor total a ser pago sera de R$" + precoTotal);
		

	}

}
