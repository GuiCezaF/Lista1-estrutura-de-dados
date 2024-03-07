package lista1;
public class ex3 {

  public static boolean verificaOrdem(int[] vetor) {
    boolean ordenadoCrescente = true;
    boolean ordenadoDecrescente = true;

    // Verifica se está ordenado de forma crescente
    for (int i = 0; i < vetor.length - 1; i++) {
      if (vetor[i] > vetor[i + 1]) {
        ordenadoCrescente = false;
        break;
      }
    }

    // Verifica se está ordenado de forma decrescente
    for (int i = 0; i < vetor.length - 1; i++) {
      if (vetor[i] < vetor[i + 1]) {
        ordenadoDecrescente = false;
        break;
      }
    }

    // Retorna verdadeiro se estiver ordenado de forma crescente ou decrescente
    return ordenadoCrescente || ordenadoDecrescente;
  }

  public static void main(String[] args) {
    int[] vetor1 = { 1, 2, 3};
    int[] vetor2 = { 3, 2, 1 };
    int[] vetor3 = { 1, 2, 3, 7, 2};

    boolean retornaCaso1 = verificaOrdem(vetor1);
    boolean retornaCaso2 = verificaOrdem(vetor2);
    boolean retornaCaso3 = verificaOrdem(vetor3);

    
    System.out.printf("Retorno do caso 1: %s \n",retornaCaso1 );

    System.out.printf("Retorno do caso 2: %s \n", retornaCaso2);

    System.out.printf("Retorno do caso 3: %s \n", retornaCaso3);
  }
}