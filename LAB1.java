public class LAB1 {
    public static void main (String[] args) {
        Funcionario f1 = new Funcionario("Jose", 3000, 123);
        Funcionario f2 = new Funcionario("Pedro", 1);

        f1.addDep(new Dependente("Filho1", 12));
        f1.addDep(new Dependente("Filho2", 8));
        
        f2.addDep(new Dependente("Filho3", 1));
        f2.addDep(new Dependente("Filho4", 4));

        f1.imprime();
        f2.imprime();
    }
}