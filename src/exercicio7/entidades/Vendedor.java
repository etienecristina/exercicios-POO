package exercicio7.entidades;

import exercicio7.entidades.Funcionario;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    /**
     * Para Vendedor, o método bonificação deve retornar o salário + 3000.00;
     * */

    @Override
    public double bonificacao() {
        double salarioComBonificacao;
        salarioComBonificacao = super.getSalario() + 3000;
        return salarioComBonificacao;
    }

    @Override
    public String toString() {
        return "Vendedor - nome: " +
                getNome() +
                " - idade: " +
                getIdade() +
                " - Salário: R$ " +
                bonificacao();
    }
}
