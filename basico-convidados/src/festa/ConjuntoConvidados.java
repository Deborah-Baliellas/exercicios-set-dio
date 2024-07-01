package festa;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados () {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()){
            for (Convidado c : convidadoSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

         // Exibindo o número de convidados no conjunto (deve ser zero)
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    // Adicionando convidados ao conjunto
    conjuntoConvidados.adicionarConvidado("Alice", 1234);
    conjuntoConvidados.adicionarConvidado("Bob", 1235);
    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
    conjuntoConvidados.adicionarConvidado("David", 1236);

    // Exibindo os convidados no conjunto
    System.out.println("Convidados no conjunto:");
    conjuntoConvidados.exibirConvidados();

    // Exibindo o número atualizado de convidados no conjunto
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    // Removendo um convidado do conjunto por código de convite
    conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

    // Exibindo os convidados atualizados no conjunto
    System.out.println("Convidados no conjunto após a remoção:");
    conjuntoConvidados.exibirConvidados();
  }


        

    
}
