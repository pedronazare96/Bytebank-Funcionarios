public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setSalario(5000.0);
        g1.setCpf("222.222.222-231");

        System.out.println("O nome do Gerente é: "+g1.getNome());
        System.out.println("O CPF dele é: "+g1.getCpf());
        System.out.println("O salário dele será: "+ g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println("A bonificação do Marco é: "+g1.getBonificacao());
    }
}
