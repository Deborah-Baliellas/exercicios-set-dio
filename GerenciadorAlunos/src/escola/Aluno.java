package escola;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }


    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Aluno aluno))
            return false;
        return getMatricula() == aluno.getMatricula();
    }

    public int hashCode() {
        return Objects.hash(getMatricula());
    }


    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return nome;
    }


    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
        
    }

}
class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
        
    }
    
}
