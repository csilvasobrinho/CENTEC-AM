package pooBasico;

public class Programa {
	public static void main(String[] args) {
			
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000;
				
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}

}