package listaExercicios01;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		int idade;
		
		Scanner lerIdade = new Scanner(System.in);
		
		System.out.println("Idade: ");
		idade = lerIdade.nextInt();
		
		if(idade <= 12) {
			System.out.println("Criança!");
		}else if((idade >12) && (idade < 18)) {
			System.out.println("Adolescente!");
		}else if(idade >=18) {
			System.out.println("Adulto!");
		}
		lerIdade.close();
	}
}
