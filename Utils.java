public class Utils{
  public void mostrarOpcoes(String[] opcoes){
    for(int n=0; n < opcoes.length; n++){
      System.out.printf("%d) %s.\n", n+1, opcoes[n]);
    }
  }
}