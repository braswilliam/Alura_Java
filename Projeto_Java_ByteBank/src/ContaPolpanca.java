public class ContaPolpanca extends Conta{


    public ContaPolpanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }




}
