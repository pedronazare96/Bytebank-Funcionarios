public class SistemaInterno {
    private int senha = 2222;
    public void autentico(Gerente g){
      boolean autenticou =   g.autentica(this.senha);
      if(autenticou){
          System.out.println("Acesso válido, Bem vindo");
      }else {
          System.out.println("Acesso invalido");
      }
    }

}
