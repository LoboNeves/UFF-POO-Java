public abstract class Conta {
    protected String nome;
    protected int cpf;
    protected int saldo;
    protected int numeroConta;

    //Método Construtor
    public Conta (String nome, int cpf, int saldo, int numeroConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //Imprime Conta
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Num.Conta: " + this.numeroConta);
    }

    //Método abstrato para ser implementado nas subclasses
    protected abstract double creditoDebito (double valor);
}
