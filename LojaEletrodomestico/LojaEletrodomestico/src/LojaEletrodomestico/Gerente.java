package LojaEletrodomestico;

//Faço mais uma clase filha denomidada Gerente

// Dou eentrada aos atributos únicos da classe
class Gerente extends Funcionario {
    private String departamento;
    private int numSubordinados;
    private double bonusAnual;
    //Com o método construtor, faço o encapsulamento para utilizar os atributos geral no Objeto
    public Gerente(String nome, int idade, String cargo, double salario, double bonus, String departamento, int numSubordinados, double bonusAnual) {
        super(nome, idade, cargo, salario, bonus);
        this.departamento = departamento;
        this.numSubordinados = numSubordinados;
        this.bonusAnual = bonusAnual;
    }
// Crio dois métodos normais para realizar com objeto
    public void gerenciar() {
        System.out.println(getNome() + " está gerenciando o departamento " + departamento);
    }

    public void calcularBonusAnual() {
        System.out.println("O bônus anual do gerente " +getNome() + " é R$" + bonusAnual);
    }
// Faço o get e set dos atributos
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}