package listaExercicios01;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		int anoAtual, anoNasc, idade;
		String nome;
		
		Scanner lerAno = new Scanner(System.in);
		Scanner lerNome = new Scanner(System.in);
		
		System.out.println("Ano Atual: ");
		anoAtual = lerAno.nextInt();
		System.out.println("Ano Nasc.: ");
		anoNasc = lerAno.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Idade: " + idade);
		
		if (idade >= 18) {
			System.out.println("Nome: ");
			nome = lerNome.nextLine();
			System.out.println(nome + " Superior a 18 anos. Entrada permitida.");
		}
		lerAno.close();
		lerNome.close();
		
	
	}

}
