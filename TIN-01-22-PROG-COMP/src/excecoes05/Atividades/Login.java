package excecoes05.Atividades;
public class Login {
	private String usuario = "csilva"; // Determina o nome do usuário
	private String senha = "123"; // Determina a senha do usuário.

	public Login(String _usuario, String _senha) {
		// Construtor padrão
	}
	public void setSenha(	String _senha) {
		// Troca a senha do usuário.
	}
	
	public boolean fazerLogin(String _usuario, String _senha) {
		
		try {
			if((!usuario.equals(_usuario)) && (!senha.equals(_senha))) {
				throw new Exception("Senha invalida!!!");
			}
			System.out.println("Senha correta!!!\nBem vindo(a)!!!");
	    } catch (Exception ex) {
	      System.out.println(ex.getMessage());
	    }
	    
		/*
		 * Deve receber informações de usuário e senha e compara-las com as da classe.
		 * Caso sejam realmente iguais, deve retornar verdadeiro, ou então deve lançar
		 * uma nova exceção dizendo qual credencial está errada, tratar essa exceção
		 * dentro do próprio método imprimindo o erro em tela e por fim retornar false.
		 * Ex:
		 * 
		 * 
		 * try{ if(<<usuário incorreto>>) { throw new Exception(“Usuário incorreto”); }
		 * } catch (Exception e) { System.out.println(“Erro”); }
		 */
		return false;
	}
}