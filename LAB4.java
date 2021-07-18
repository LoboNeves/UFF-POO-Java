//Programa para testar o uso de interfaces, criando uma função que ordena classes implementadas com a interface.
public class LAB4 {
    public static void main(String[] args) {
        //Criação e ordenação de funcionarios por nome em ordem alfabetica
        Funcionario[] vetf = new Funcionario[3];
        vetf[0] = new Gerente("Juliana",8000.0,1,300,"Fox");
        vetf[1] = new Coordenador("Bia",3000.0,2,"Mobile Game Project");
        vetf[2] = new Funcionario("Edu", 2000.0);
        Util.ordena(vetf); //método para ordenar vetores do tipo Comparador
        System.out.println("Ordenacao de funcionarios por ordem alfabetica");
        for (int i = 0; i < vetf.length; i++) {
            System.out.println(vetf[i].getNome() + " " + vetf[i].getSalario());
        }

        //Criação e ordenação de contas por saldo em ordem crescente
        Conta[] vetc = new Conta[3];
        vetc[0] = new Comum("Alfredo", 123, 1000.00, 123);
        vetc[1] = new Poupanca("Ricardo", 456, 1500.00, 456, 0.03);
        vetc[2] = new Especial("Andressa", 789, 2000.00, 789, 0.05);
        Util.ordena(vetc); //método para ordenar vetores do tipo Comparador
        System.out.println("\nOrdenacao de contas por saldo (de menor para maior):");
        for (int i = 0; i < vetc.length; i++) {
            System.out.println(vetc[i].nome + " " + vetc[i].saldo);
        }        
    }
}
