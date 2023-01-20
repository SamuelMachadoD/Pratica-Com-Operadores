package com.samuel.praticaComOperadores.questao17;

import java.util.Scanner;

/*17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho 
 * em metros quadrados da área a ser pintada. Considere que a cobertura da 
 * tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em 
 * latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, 
 * que custam R$ 25,00. Informe ao usuário as quantidades de tinta a 
 * serem compradas e os respectivos preços em 3 situações: 
 * 
 * Comprar apenas latas de 18 litros;
 * Comprar apenas galões de 3,6 litros;
 * 
 * Misturar latas e galões, de forma que o preço seja o menor. 
 * Acrescente 10% de folga e sempre arredonde os valores para cima, 
 * isto é, considere latas cheias;
 * 
 * */
public class Questao17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double baldes = 0;
		double galoes = 0;
		double restoDeTinta = 0;
		double litrosDeTinta = 0;
		double precoTotal = 0;
		double metros2 = 0;
		int opcao = 0;
		
		
		System.out.println("Quantos metros quadrados serao pintados?");
		metros2 = scan.nextDouble();
		
		
		litrosDeTinta = metros2 / 6;
		
		System.out.println("Voce vai precisar de aproximadamente " + Math.round(litrosDeTinta) + "L de tinta.");
		System.out.println("Veja nossas opcoes: ");
		System.out.println("1 - Comprar apenas Latas (18 litros) : R$80,00 unidade");
		System.out.println("2 - Comprar apenas Galoes (3,6 litros) : R$25,00 unidade");
		System.out.println("3 - Mesclar pelo melhor preço ( 10% de comissao )");
		opcao = scan.nextInt();
		
		switch(opcao) {
		
		case 1:
			if(litrosDeTinta >= 18) {
				baldes = Math.ceil(litrosDeTinta / 18);
				precoTotal = 80 * baldes;
			}else {
				baldes = 1;
				precoTotal = 80;
			}
			System.out.println("Equivalente a " + baldes + " baldes de tinta!");
			System.out.println("O valor total a ser pago sera de R$" + precoTotal);
			
			break;
			
		case 2:
			
			if(litrosDeTinta >= 3.6) {
				galoes = Math.ceil(litrosDeTinta / 3.6);
				precoTotal = 25 * galoes;
			}else {
				galoes = 1;
				precoTotal = 25;
			}
			System.out.println("Equivalente a " + galoes + " galoes de tinta!");
			System.out.println("O valor total a ser pago sera de R$" + precoTotal);
		
			break;
			
		case 3:
			
			baldes = litrosDeTinta / 18;
			

			if(baldes >= 1) {
				
				baldes = Math.floor(litrosDeTinta / 18);//.floor arrendonda para baixo
				restoDeTinta = litrosDeTinta % 18;

				if(restoDeTinta > 0) {
					
					galoes = Math.ceil(restoDeTinta / 3.6);//.cell arrendonda para cima
					
				}
				precoTotal = ((80 * baldes) + (25 * galoes)) * 1.10;
				
			}else{
				
				galoes = Math.ceil(litrosDeTinta / 3.6);
				precoTotal = 25 * galoes;
			}
			System.out.println("Equivalente a " + baldes + " baldes e " + galoes + " galoes de tinta!");
			System.out.println("O valor total a ser pago sera de R$" + precoTotal);
			break;
			default:
				System.out.println("A opcao digitada e invalida!");
		
		}
		
		

	}

}
