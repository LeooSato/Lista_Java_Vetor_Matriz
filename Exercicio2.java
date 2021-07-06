package br.com.generetion.ExercicioVetorMatriz;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int contador = 0;
		int[] Dados = new int[5];
		int maiorDado = 0;
		
		//Inscreve os dados no vetor e Valida!
		
		for(int l=0;l < Dados.length;l++) {
			
			System.out.print("Insira a nota a rolada do dado "+(l+1)+": ");
			Dados[l] = ler.nextInt();
			
			if(Dados[l] <= 6) {
				System.out.println("Dado Valido!!!");
				continue;
			}
			else {
				System.out.println("Renicie a entrada de dados!!!");
				break;
			}	
			
		}
			//Imprime os Valores
		
		for(int l=0; l<Dados.length;l++) {
			System.out.println("os dados inseridos são:"+ Dados[l]+"\t" );
			
			if(Dados[l] > maiorDado) {
				maiorDado = Dados[l];
			}}
		
		for(int l=0; l<Dados.length;l++) {
			if(Dados[l] == maiorDado) {
				contador = contador+1;
				}}
			
			System.out.println("O valor "+maiorDado+" Repetiu-se "+contador+" Vezes");
		
	}

}
