package aula05;

public class ContadorDeAcesso {
   private static int contagem;

   public static void novoAcesso() {
     contagem = contagem + 1;
   }
   public static int getQuantidadeAcessos() {
     return contagem;
     
     
     
     
   }
}