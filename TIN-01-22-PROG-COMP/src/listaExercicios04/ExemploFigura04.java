package listaExercicios04;

public class ExemploFigura04 {
	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10; //declarando a constante
		int[] array = new int[ARRAY_LENGTH]; //criando o array
		
		//calculando o valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + 2 * counter;
		}
		
		System.out.printf("%s%8s%n", "INDICE", "VALORES"); //Títulos de coluna
		
		//Gera saída do valor de cada elemento do array
		for(int counter =0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
}
