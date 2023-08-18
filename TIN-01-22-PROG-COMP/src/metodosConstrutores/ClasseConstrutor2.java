package metodosConstrutores;
/*
 * Classe utilizada para demonstrar o uso do construtor
 * que inicializa os atributos da classe. 
 */
public class ClasseConstrutor2 {
  public int atributo1;
  public float atributo2;
  public boolean atributo3;
  /*
   * Construtor que recebe os valores para inicializar os atributos.
   * 
   * @param valor1 - Valor inteiro que será guardado no atributo1.
   * @param valor2 - Valor float que será guardado no atributo2.
   * @param valor3 - Valor boolean que será guardado no atributo3.
   */
  public ClasseConstrutor2(int valor1, float valor2, boolean valor3) {
    System.out.println("Criando um objeto da classe ClasseConstrutor2.");
    System.out.println("Recebeu os seguintes parametros:\n\t" + valor1);
    System.out.println("\t" + valor2);
    System.out.println("\t" + valor3);

    atributo1 = valor1;
    atributo2 = valor2;
    atributo3 = valor3;
  }
}