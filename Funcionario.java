public class Funcionario {
    private double salario;
    private String nome;
    private int matricula;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = validaSalario(salario);
    }

    public static final double SALARIO_MINIMO = 380.00;
    public static final double SALARIO_PRESIDENTE = 24000.0;

    private double validaSalario(double salario) {
        if (salario > SALARIO_PRESIDENTE) {
            return SALARIO_PRESIDENTE;
        }

        else if (salario < SALARIO_MINIMO) {
            return SALARIO_MINIMO;
        }

        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}