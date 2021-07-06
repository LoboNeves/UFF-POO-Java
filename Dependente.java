public class Dependente {
    private String nome;
    private int idade;

    //Método Construtor
    public Dependente (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Funções para set/get de nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Funções para set/get de  idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Imprime o dependente
    public void imprime(){
        System.out.print("-Nome: " + this.nome);
        System.out.println(" Idade: " + this.idade);
    }
}
