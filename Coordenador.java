public class Coordenador extends Funcionario {
    private String projeto;

    //Metódo Construtor
    public Coordenador (String nome, double salario, int matricula, String projeto) {
        super(nome, salario, matricula); //reaproveitando construtor da superclasse
        this.projeto = projeto;
    }

    public void imprime () {
        super.imprime();// aproveitando também o imprime da superclasse.
        System.out.println("Atributos especiais do cargo: projeto " + this.projeto);    
    }
}
