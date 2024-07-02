package agenda_tefefone;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Contato contato))
            return false;
        return Objects.equals(getNome(), contato.getNome());
    } // Convidado era o nome da Classe/Objeto ao qual eu estava trabalhando no meu
      // projeto, portanto deve ser substituido pela Classe/Objeto de desejo.
      // codigoConvite era o atributo que não poderia se repetir.
      // Este código foi inserido na mesma aba que continha a Classe Convidado.

    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "{" + nome + "," + numero + "}";
    }

}
