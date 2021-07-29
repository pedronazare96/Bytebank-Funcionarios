public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente nico = new Gerente();
        nico.setNome("Nico silva");
        nico.setCpf("222.222.222-222");
        nico.setSalario(3000.0);

        System.out.println(nico.getNome());
        System.out.println("Bonificação de Nico é: "+nico.getBonificacao());
    }
}
