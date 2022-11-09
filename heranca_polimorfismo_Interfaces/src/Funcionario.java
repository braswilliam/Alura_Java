public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;



    public Funcionario() {
    }

    public Funcionario(String var1, String var2, double var3) {
        this.nome = var1;
        this.cpf = var2;
        this.salario = var3;
    }


    public abstract double getBonificacao(); //obriga os filhos a implementar o corpo desse método

    public String getNome() {
        return this.nome;
    }

    public void setNome(String var1) {
        this.nome = var1;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String var1) {
        this.cpf = var1;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double var1) {
        this.salario = var1;
    }
}


