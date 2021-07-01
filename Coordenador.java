public class Coordenador extends Funcionario {
    private String projeto;

    //Metódo Construtor
    public Coordenador (String nome, double salario, int matricula, String projeto) {
        super(nome, salario, matricula); //reaproveitando construtor da superclasse
        this.projeto = projeto;
    }

    //Imprime Coordenador e seu projeto 
    public void imprime () {
        super.imprime();// aproveitando também o imprime da superclasse.
        System.out.println("Projeto: " + this.projeto);
        System.out.println();    
    }
}
