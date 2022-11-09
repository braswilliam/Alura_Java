public class TesteContas {
    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);


        ContaPolpanca cp = new ContaPolpanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10, cp);
        System.out.println("Saldo da conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo da conta Poupança: " + cp.getSaldo());

    }
}
