package conjunto_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas (){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }        
            }
            tarefaSet.remove(tarefaParaRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("O conjunto está vazio!");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);                
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                tarefasPendentes.add(t);                
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
                break;
            }
        }
        System.out.println("Tarefa marcada como concluída");
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t :tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isTarefaConcluida()){
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
                System.out.println("Tarefa marcada como pendente.");
            } else {
                System.out.println("Tarefa já está pendente.");
            }
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void limparListaTarefas() {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.removeAll(tarefaSet);
            System.out.println("Conjunto removido com sucesso!");
        } else {
            System.out.println("O conjunto já está vazio");
        }
    }


    public static void main(String[] args) throws Exception {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    listaTarefas.exibirTarefas();

    // Removendo uma tarefa
    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(listaTarefas.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    System.out.println(listaTarefas.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    // Limpando a lista de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
    }
}
