import java.util.List;

public class ColaboradorProxy implements IColaborador {

    private Colaborador colaborador;

    private String cpf;

    public ColaboradorProxy(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.colaborador == null) {
            this.colaborador = new Colaborador(this.cpf);
        }
        return this.colaborador.obterDadosPessoais();
    }

    @Override
    public List<Float> obterSalario(Gestor gestor) {
        if (!gestor.isFinanceiro()) {
            throw new IllegalArgumentException("Gestor não autorizado");
        }
        if (this.colaborador == null) {
            this.colaborador = new Colaborador(this.cpf);
        }
        return this.colaborador.obterSalario(gestor);
    }
}
