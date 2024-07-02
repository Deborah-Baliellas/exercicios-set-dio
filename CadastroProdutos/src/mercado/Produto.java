package mercado;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;   
        return getCodigo() == produto.getCodigo();
} // Convidado era o nome da Classe/Objeto ao qual eu estava trabalhando no meu projeto, portanto deve ser substituido pela Classe/Objeto de desejo.
      // codigoConvite era o atributo que não poderia se repetir.
      // Este código foi inserido na mesma aba que continha a Classe Convidado.

public int hashCode(){
		    return Objects.hash(getCodigo());
}

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
        "codigo=" + codigo +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
       return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}
