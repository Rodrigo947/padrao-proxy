public class Gestor {
    private String nome;
    private boolean financeiro;

    public Gestor(String nome, boolean financeiro) {
        this.nome = nome;
        this.financeiro = financeiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(boolean financeiro) {
        this.financeiro = financeiro;
    }
}
