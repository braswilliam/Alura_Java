package aplication;

import entities.ContratoDeHoras;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NIvelDeTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do tarabalhador:");
        System.out.print("Nome: ");
        String nomeDoTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelDotrabalhador = sc.nextLine().toUpperCase();
        System.out.print("Salario Base: ");
        double salarioDoTrabalhador = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeDoTrabalhador, NIvelDeTrabalho.valueOf(nivelDotrabalhador),salarioDoTrabalhador, new Departamento(nomeDepartamento));


        System.out.print("Informe o número de contratos desse funcionário: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrato de número #" + i + ": ");
            System.out.print("Dada (DD/MM/AAAA): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração em (horas): ");
            int horas = sc.nextInt();

            ContratoDeHoras contrato = new ContratoDeHoras(dataContrato, valorPorHora, horas);
            trabalhador.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Entre com o mês e o ano para caulcularmos o salário (MM/AAAA): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3, 7));
        System.out.println("Trabalhador: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getName());//melhor exemplo de composição.

        System.out.println("renda durante " + mesEAno + ": " + String.format("%.2f",  trabalhador.calcReda(ano, mes)));


        sc.close();
    }


}
