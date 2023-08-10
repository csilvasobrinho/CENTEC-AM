package aulaPOOBasico;

public class Conta {
	int numero;
	String titular;
	double saldo;
	
	void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		
	}
	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
	
	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
}
