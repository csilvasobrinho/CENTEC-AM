import java.util.Scanner;
public class LE06_Q02_Rev00 {

	public static void main(String[] args) {
		int soma=0, media=0, qaluno=0;
		 
        System.out.println("Informe a Quantidade de Alunos q serão Cadastrados");
        qaluno= new Scanner(System.in).nextInt();
 
        String[] nome = new String[qaluno];
        int[] nota = new int[qaluno];
 
        for (int i=0; i<qaluno; i++) {
        	System.out.println ("Insira o Nome do Aluno nº " + i);
        	nome[i] = new Scanner(System.in).nextLine();
 
            System.out.println ("Insira a Nota do Aluno nº " + i);
            nota[i] = new Scanner(System.in).nextInt();
 
            soma= soma + nota[i];
        }
        media= soma/qaluno;
 
        System.out.println("Alunos c/ Nota Maior que a Média da Turma");
 
        for (int i=0; i<qaluno; i++) {    
            if (nota[i]>media){
                System.out.print(nome[i] + " - ");
                System.out.println(nota[i]);
            }
        }
    }
}
