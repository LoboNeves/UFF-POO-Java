//Programa para testar a criação de heranças, com as classes Coordenadores, Gerentes, Departamentos e seus funcionários, como a impressão de ambos.
public class LAB2 {
    public static void main (String[] args) {
        Funcionario f1 = new Funcionario("Jose", 3000, 123);
        Coordenador c1 = new Coordenador("Ricardo", 9000, 456, "AI");
        Gerente g1 = new Gerente("Ana", 18000, 789, 200);
        Departamento d1 = new Departamento("TI");
        Departamento d2 = new Departamento("Contabilidade");

        //Adicionando dependentes em cada funcionário
        f1.addDep(new Dependente("Filho1", 6));
        g1.addDep(new Dependente("Filho2", 14));

        //Adicionando funcionários em cada departamento
        d1.addFuncionario(f1);
        d2.addFuncionario(c1);
        d2.addFuncionario(g1);

        d1.imprime();
        System.out.println();
        d2.imprime();
    }
}
