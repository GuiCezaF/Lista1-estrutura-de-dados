package lista1;

/*
Considere um “produtório” como o resultado da multiplicação de um conjunto de
números entre eles mesmos. Crie uma função que recebe como parâmetro de entrada
um vetor de números inteiros e retorna o resultado da multiplicação de todos os
números positivos entre s
 */

public class ex1 {

  static int Multiplica(int valores[]){
    int mult = 1;
    
    for (int i = 0; i < valores.length; i++){
      if (valores[i] >= 0){
        mult *= valores[i];
      }
    }
    return mult;
  }
  public static void main(String[] args) {
    int[] vetor = new int[]{
      -10,
      20,
      -8,
      2,
    };
    System.out.println(Multiplica(vetor));
  }
}
