import java.util.Scanner;
public class LE02_Q03_Rev00 {
	public static void main(String[] args) {
		int idade=0;
		Scanner lerIdade = new Scanner(System.in);
		System.out.println("Idade: ");
		idade = lerIdade.nextInt();
		if(idade <= 12) {
			System.out.println("Criança");
		}else if((idade >12 ) && (idade <18)) {
			System.out.println("Adolescentes");
		}else {
			System.out.println("Adulto");
		}
	}
}