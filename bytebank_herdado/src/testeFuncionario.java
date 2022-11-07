public class testeFuncionario {
    public static void main(String[] args) {
        
        Funcionario william = new Funcionario("William B. Pereira", "222.222.22-22", 2600.00);
        System.out.println(william.getNome());
        System.out.println(william.getBonificacao());
        
        //william.salario = 300.0;

        System.out.println(william.getBonificacao());



    }
}
