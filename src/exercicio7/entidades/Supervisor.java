package exercicio7.entidades;

import exercicio7.entidades.Funcionario;

public class Supervisor extends Funcionario {
    public Supervisor(String nome, int idade, double salario){
        super(nome, idade, salario);
    }


    /**
     * Para Supervisor, o método bonificação deve retornar o salário + 5000.00;
    **/
    @Override
    public double bonificacao() {
        double salarioComBonificacao;
        salarioComBonificacao = super.getSalario() + 5000;
        return salarioComBonificacao;
    }

    @Override
    public String toString() {
        return "Supervisor - nome: "+
                getNome()+
                " - idade: "+
                getIdade()+
                " - Salário: R$ "+
                bonificacao();
    }
}
