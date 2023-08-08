import java.util.Scanner;
public class LE03_Q10_Rev00 {
	public static void main(String[] args) {
		int cont; int idade; int contCri=0; 
		int contAdo=0; int contAdu=0;
		
		Scanner lerIdade = new Scanner(System.in);
		
		for(cont=1; cont<=5;cont++) {
			System.out.println("Idade: ");
			idade = lerIdade.nextInt();
			if(idade <=12) {
				System.out.println("Criança!");
				contCri++;
			}else if((idade > 12) && (idade <=18)) {
				System.out.println("Adolescente!");
				contAdo++;
			}else {
				System.out.println("Adulto!");
				contAdu++;
			}
		}
		System.out.println("Crianças: " + contCri);
		System.out.println("Adolescentes: " + contAdo);
		System.out.println("Adultos: " + contAdu);
	}
}
