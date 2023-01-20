package com.samuel.praticaComOperadores.questao15;

import java.util.Scanner;

/*15. Faça um Programa que pergunte quanto você ganha por hora e o
* número de horas trabalhadas no mês. Calcule e mostre o total do seu
* salário no referido mês, sabendo-se que são descontados 11% para o
* Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
* programa que nos dê:
* A - salário bruto.
* B - quanto pagou ao INSS.
* C - quanto pagou ao sindicato.
* D - o salário líquido
* E - calcule os descontos e o salário líquido, conforme a tabela abaixo:
* Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
* Obs.: Salário Bruto - Descontos = Salário Líquido.
*/
public class Questao15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salarioPorHora = 0;
		double salarioBruto = 0;
		double salarioLiquido = 0;
		double horasTrabalhadas = 0;
		double impostoDeRenda = 0;
		double inss = 0;
		double sindicato = 0;
		double descontos = 0;
		
		System.out.println("Quanto voce ganha por hora? ");
		salarioPorHora = scan.nextDouble();
		
		System.out.println("Quanto voce trabalha por mes(horas)? ");
		horasTrabalhadas = scan.nextDouble();
		
		salarioBruto = salarioPorHora * horasTrabalhadas;
		impostoDeRenda = salarioBruto * 0.11;
		inss = salarioBruto * 0.08;
		sindicato = salarioBruto * 0.05;
		descontos = impostoDeRenda + inss + sindicato;
		salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario Bruto - R$" + salarioBruto);
		System.out.println("Imposto de renda - R$" + impostoDeRenda);
		System.out.println("INSS - R$" + inss);
		System.out.println("Sindicato - R$" + sindicato);
		System.out.println("TOTAL DE DESCONTOS - R$" + descontos);
		System.out.println("Salario Liquido - R$" + salarioLiquido);
		

	}

}
