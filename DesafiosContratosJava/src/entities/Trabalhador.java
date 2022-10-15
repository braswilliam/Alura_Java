package entities;

import entities.enums.NIvelDeTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NIvelDeTrabalho nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoDeHoras> contratos = new ArrayList<>(); //iniciando uma lista vazia.

    public Trabalhador() {
    }

    public Trabalhador(String nome, NIvelDeTrabalho nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NIvelDeTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NIvelDeTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoDeHoras> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoDeHoras contrato) {
        contratos.add(contrato);
    }

    public void rmContrato(ContratoDeHoras contrato) {
        contratos.remove(contrato);
    }

    public double calcReda(int ano, int mes){
        double sum = this.salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoDeHoras c:contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH) ;
            if (ano == c_ano && mes == c_mes){
                sum += c.valorTotal();
            }
        }

        return sum;
    }

}


