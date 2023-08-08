package listaExercicios01;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		String nomeAluno;
		double n1, n2, n3, m;
		
		Scanner lerNome = new Scanner(System.in);
		Scanner lerNotas = new Scanner(System.in);
		
		System.out.println("Aluno: ");
		nomeAluno = lerNome.nextLine();
		System.out.println("N. 01: ");
		n1 = lerNotas.nextDouble();
		System.out.println("N. 02: ");
		n2 = lerNotas.nextDouble();
		System.out.println("N. 03: ");
		n3 = lerNotas.nextDouble();
		
		m = (n1 + n2 + n3) / 3;
		
		if (m >= 7) {
			System.out.println(nomeAluno + " Aprovado! Média: " + m);
		}else {
			System.out.println(nomeAluno + " Reprovado! Média: " + m);
		}
		lerNotas.close();
		lerNome.close();
		
	}

}
