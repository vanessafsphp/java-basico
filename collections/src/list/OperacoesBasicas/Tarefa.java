package list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    // Este é o construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
