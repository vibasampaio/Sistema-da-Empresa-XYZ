public class Utils{
  public void mostrarOpcoes(String[] opcoes){
    for(int n=1; n <= opcoes.length; n++){
      System.out.printf("%d) %s.\n", n, opcoes[n]);
    }
  }
}