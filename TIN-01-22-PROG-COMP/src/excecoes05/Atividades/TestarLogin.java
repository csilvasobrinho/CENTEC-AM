package excecoes05.Atividades;
import java.util.Scanner;
public class TestarLogin {
	public static void main(String[] args) {
		String u, s;
		
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Login: ");
		u = lerDados.nextLine();
		System.out.println("Senha: ");
		s = lerDados.nextLine();
		
		Login dados = new Login(u, s);
		
		dados.fazerLogin(u, s);
		
	}

}
