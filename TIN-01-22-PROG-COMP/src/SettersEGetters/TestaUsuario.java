package SettersEGetters;

import java.util.Scanner;

public class TestaUsuario {
	public static void main(String[] args) {
		String login;
		Usuario user01 = new Usuario();
		Scanner lerLogin = new Scanner(System.in);
		
		System.out.println("Login: ");
		login = lerLogin.nextLine();
		user01.setLogin(login);
		
		System.out.println(user01.getLogin());
	}

}
