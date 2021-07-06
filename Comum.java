public class Comum extends Conta {

    //Chamando método construtor da superclasse(Conta)
    public Comum (String nome, int cpf, int saldo, int numeroConta) {
        super(nome, cpf, saldo, numeroConta);
    }
    
    //Implementação da função para conta comum
    protected double creditoDebito (double valor) {
        if (valor >= 0) saldo += valor;
        else saldo -= valor;

        return saldo;
    };

    //Imprime Conta Comum
    public void imprime(){
        super.imprime();// aproveitando também o imprime da superclasse.
        System.out.println();
    }
}
