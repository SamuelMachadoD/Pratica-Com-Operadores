package com.samuel.praticaComOperadores.questao18;

import java.util.Scanner;

/*18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a 
 * velocidade de um link de Internet (em Mbps), calcule e informe o 
 * tempo aproximado de download do arquivo usando este link (em minutos).*/
public class Questao18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double arquivo = 0;
		double link = 0;
		double tempoSegundos = 0;
		double tempoMinutos = 0;
		
		System.out.println("Digite o tamanho do arquivo para download(MB): ");
		arquivo = scan.nextDouble();
		System.out.println("Digite a velocidade do link(Mbps): ");
		link = scan.nextDouble();
		
		tempoSegundos = (arquivo / (link / 8));
		tempoMinutos = Math.floor(tempoSegundos / 60);
		tempoSegundos -= (tempoMinutos * 60);
		
		System.out.println("Neste link o arquivo tera seu download concluido em " + tempoMinutos + " Minutos e " + tempoSegundos + " Segundos.");

	}

}
