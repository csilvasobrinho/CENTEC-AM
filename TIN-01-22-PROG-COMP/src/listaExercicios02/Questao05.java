package listaExercicios02;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		int cont, anoAtual, anoNasc, idade;
		
		Scanner lerValor = new Scanner(System.in);
		System.out.println("Ano Atual: ");
		anoAtual = lerValor.nextInt();
		
		for(cont = 1; cont <= 10; cont++) {
			System.out.println("Ano Nasc.: ");
			anoNasc = lerValor.nextInt();
			idade = anoAtual - anoNasc;
			System.out.println("Idade: " + idade + " anos.");
			if(idade <= 18) {
				System.out.println("Menor de idade.");
			}else {
				System.out.println("Maior de Idade");
			}
		}
		
		
	}

}
