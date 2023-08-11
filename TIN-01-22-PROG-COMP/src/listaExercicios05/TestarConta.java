package listaExercicios05;

public class TestarConta {
	public static void main(String[] args) {
		Conta c1; c1 =  new Conta();
		c1.nomeTitular = "Danilo";
		c1.saldo = 500;
		
		Conta c2; c2 = new Conta();
		c2.nomeTitular = "Maria";
		c2.saldo = 500;
		
		if(c1.saldo == c2.saldo) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}
		
	}
}
