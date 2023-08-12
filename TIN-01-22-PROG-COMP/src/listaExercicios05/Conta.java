package listaExercicios05;
public class Conta {
	String nomeTitular = "Manoel";
	int numeroConta;
	String agencia;
	double saldo;
	Data dataAbertura;
	
	void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		System.out.println("Saldo: " + saldo);
	}
	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	void calcularRedimento(double valor) {
		
	}
	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.nomeTitular;
		dados +=" - Dt. Abertura:: " + this.dataAbertura.dia + "/";
		dados += this.dataAbertura.mes + "/";
		dados += this.dataAbertura.ano;
		
		return dados;
	}
}