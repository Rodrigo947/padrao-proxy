import java.util.Arrays;
import java.util.List;

public class Colaborador implements IColaborador {

    private String cpf;
    private String nome;
    private Float salario;


    public Colaborador(String cpf) {
        this.cpf = cpf;
        Colaborador objeto = BD.getColaborador(cpf);
        this.nome = objeto.nome;
        this.salario = objeto.salario;
    }

    public Colaborador(String cpf, String nome, Float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCPF() {
        return cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cpf);
    }

    @Override
    public List<Float> obterSalario(Gestor gestor) {
        return Arrays.asList(this.salario);
    }
}
