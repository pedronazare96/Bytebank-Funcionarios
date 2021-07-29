public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;


    public Funcionario(){

    }

    public double bonificacao;
    //metodo sem corpo, não há implementação porque cada umas classe terá sua própria.S
    public abstract double getBonificacao();
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
