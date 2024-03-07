package lista1;
import java.util.Arrays;

public class ex2 {
  // Considere que dois vetores são idênticos quando ambos possuem a mesma
  // quantidade de elementos, eles possuem os mesmos elementos e estão na mesma
  // ordem. Crie uma função que recebe como parâmetros de entrada dois vetores de
  // números inteiros e retorna true caso eles sejam idênticos, ou false, caso
  // contrário.

  public static void main(String[] args) {

    // Caso 1
    int[] vetor1Caso1 = { 1, 2, 3 };
    int[] vetor2Caso1 = { 1, 2, 3 };

    // Caso 2
    int[] vetor1Caso2 = { 1, 2 };
    int[] vetor2Caso2 = { 1, 2, 3 };

    // Caso 3
    int[] vetor1Caso3 = { 3, 2, 1 };
    int[] vetor2Caso3 = { 1, 2, 3 };

    boolean resultCaso1 = VetoresIguais(vetor1Caso1, vetor2Caso1);
    boolean resultCaso2 = VetoresIguais(vetor1Caso2, vetor2Caso2);
    boolean resultCaso3 = VetoresIguais(vetor1Caso3, vetor2Caso3);


    System.out.printf("Retorno do caso 1: %s \n",resultCaso1 );

    System.out.printf("Retorno do caso 2: %s \n", resultCaso2);

    System.out.printf("Retorno do caso 3: %s \n", resultCaso3);

  }

  static boolean VetoresIguais(int[] vet1, int[] vet2) {

    if (vet1.length != vet2.length){
      return false;
    }

    if (Arrays.equals(vet1, vet2)) {
      return true;
    }
    return false;
  }
}
