public class Fiscal extends Funcionario implements Auteticavel {

    private int senha;


    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return 400;
    }
}
