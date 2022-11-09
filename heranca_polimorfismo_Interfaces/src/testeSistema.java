public class testeSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(55555);

        Auteticavel c1 = new Cliente();
        c1.setSenha(2222);

        Fiscal f1 = new Fiscal();
        f1.setSenha(2222);


        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(c1);
        si.autentica(f1);






    }

}
