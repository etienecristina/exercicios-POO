package exercicio7.entidades;

import exercicio7.entidades.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, double salario){
        super(nome, idade, salario);
    }

    /**
     * Para Gerente, o método bonificação deve retornar o salário + 10000.00;
     * */

    @Override
    public double bonificacao() {
        double salarioComBonificacao;
        salarioComBonificacao = super.getSalario() + 10000;
        return salarioComBonificacao;
    }

    @Override
    public String toString() {
        return "Gerente - nome: "+
                getNome()+
                " - idade: "+
                getIdade()+
                " - Salário: R$ "+
                bonificacao();
    }
}
