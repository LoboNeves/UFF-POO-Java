public class Poupanca extends Conta {
    protected double jurosPagos;

    //Chamando método construtor da superclasse(Conta)
    public Poupanca (String nome, int cpf, int saldo, int numeroConta, double jurosPagos) {
        super(nome, cpf, saldo, numeroConta);
        this.jurosPagos = jurosPagos;
    }

    //Implementação da função para conta poupança
    protected double creditoDebito (double valor) {
        if (valor >= 0) saldo += valor;
        else if(saldo - valor >= 0)saldo -= valor;
        else System.out.println("Operacao invalida");

        return saldo;
    };

    //Aplicação de juros no saldo
    protected void aplicarJuros (double juros) {
        this.saldo = saldo * (1 - jurosPagos);
    } 

    //Imprime Conta Poupança
    public void imprime(){
        super.imprime();// aproveitando também o imprime da superclasse.
        System.out.println("Taxa de juros pagos: " + this.jurosPagos);
        System.out.println();
    }
}
