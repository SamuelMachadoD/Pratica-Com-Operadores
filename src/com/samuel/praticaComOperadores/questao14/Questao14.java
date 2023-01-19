package com.samuel.praticaComOperadores.questao14;

import java.util.Scanner;

/*14.João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO. */
public class Questao14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double pesoDoPeixe = 0;
		double excesso = 0;
		double multa = 0;
		
		System.out.println("Digite o peso do Peixe: ");
		pesoDoPeixe = scan.nextDouble();
		
		if(pesoDoPeixe > 50) {
			System.out.println("Houve excesso!");
			excesso = pesoDoPeixe - 50;
			multa = 4 * excesso;
		}
		
		System.out.println("Valores finais");
		System.out.println("Peso do peixe: " + pesoDoPeixe + "Kg");
		System.out.println("Excesso: " + excesso + "Kg");
		System.out.println("Valor da multa: R$" + multa);
	}

}
