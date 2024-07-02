package conjunto_tarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida;


    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaConcluida = false;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;   
        return getDescricao() == tarefa.getDescricao();
} // Convidado era o nome da Classe/Objeto ao qual eu estava trabalhando no meu projeto, portanto deve ser substituido pela Classe/Objeto de desejo.
      // codigoConvite era o atributo que não poderia se repetir.
      // Este código foi inserido na mesma aba que continha a Classe Convidado.

public int hashCode(){
		    return Objects.hash(getDescricao());
}

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    public String toString() {
        return "Tarefa{" +
            "descricao='" + descricao + '\'' +
            ", concluida=" + tarefaConcluida +
            '}';

    }



}
