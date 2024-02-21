public class ex1 {

  static int Multiplica(int valores[]){
    int mult = 1;
    for (int i = 0; i < valores.length; i++){
      mult *= valores[i];
    }
    return mult;
  }
  public static void main(String[] args) {
    int[] vetor = new int[]{
      5,
      3
    };
    System.out.println(Multiplica(vetor));
  }
}
