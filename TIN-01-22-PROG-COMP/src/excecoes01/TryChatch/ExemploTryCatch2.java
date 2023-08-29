package excecoes01.TryChatch;
import java.util.Scanner;
public class ExemploTryCatch2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try{
			System.out.print("Digite um valor inteiro..:");
			double numero1 = s.nextDouble();
			System.out.print("Digite um valor inteiro..:");
			double numero2 = s.nextDouble();
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		}catch(Exception ex){
			System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
		}
	}
}
