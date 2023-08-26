package listaExercicios11;

public class Esportes {
	
	public enum Esporte{
		FUTEBOL,
		NATACAO,
		MUSCULACAO,
		BICICLETA;
	}
	
	Esporte meuFavorito;
	
	public static void main(String[] args) {
		Esportes favorito = new Esportes();
		
		System.out.println("Meu esporte favorito é: " 
		+ favorito.meuFavorito.NATACAO);
	}
}
