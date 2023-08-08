import java.util.Scanner;
public class LE03_Q06_rev00 {

	public static void main(String[] args) {
		int anoAtual = 0; int idade = 0; int cont = 1;
		int qMaiores =0; int qMenores =0;
		
		Scanner lerIdade = new Scanner(System.in);
		
		System.out.println("Ano Atual: ");
		anoAtual = lerIdade.nextInt();
		while(cont <=10) {
			System.out.println("Idade: ");
			idade = lerIdade.nextInt();
			if(idade > 18) {
				System.out.println("Maior de Idade.");
				qMaiores = qMaiores + 1;
			}else {
				System.out.println("Menor de Idade.");
				qMenores = qMenores + 1;
			}
			cont = cont + 1;
		}
		System.out.println("Total de Maiores: " + qMaiores);
		System.out.println("Total de Menores: " + qMenores);
	}

}
