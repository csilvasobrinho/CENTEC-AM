package listaExercicios07;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner lerValor = new Scanner(System.in);
		ParOuImpar analisar = new ParOuImpar();
		int saida = 1, chico=0;
		
		while(saida == 1) {
			System.out.println("Número: ");
			chico = lerValor.nextInt();
			analisar.checaValor(chico);;
			System.out.println("Deseja Continuar? 1 = Continua | 2 = Para.");
			saida = lerValor.nextInt();
		}
		System.out.println("Obrigado!");
	}

}
