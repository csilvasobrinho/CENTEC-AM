package listaExercicios05;

public class TestarConta {
	public static void main(String[] args) {
		Conta c1; c1 =  new Conta();
		Data data; data = new Data();
		c1.nomeTitular = "Danilo";
		c1.saldo = 500;
		c1.dataAbertura = data;
		
		System.out.println(c1.recuperaDadosParaImpressao());
				
		Conta c2; c2 = new Conta();
		c2.nomeTitular = "Maria";
		c2.saldo = 500;
		
		if(c1.saldo == c2.saldo) {
			System.out.println("Saldos das contas são iguais...");
		}else {
			System.out.println("Saldos das contas são diferentes...");
		}
	}
}
