package com.samuel.praticaComOperadores.questao08;

import java.util.Scanner;

/* 8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês. */
public class Questao8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salarioPorHora = 0;
		double salarioPorMes = 0;
		double horasTrabalhadas = 0;
		
		System.out.println("Quanto voce ganha por hora? ");
		salarioPorHora = scan.nextDouble();
		
		System.out.println("Quanto voce trabalha por mes(horas)? ");
		horasTrabalhadas = scan.nextDouble();
		
		salarioPorMes = salarioPorHora * horasTrabalhadas;
		
		System.out.println("O valor do seu salario no mes e R$" + salarioPorMes);

	}

}
