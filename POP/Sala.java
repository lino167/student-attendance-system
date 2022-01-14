package POP;

import java.util.Date;

public class Sala {
    private String nomAluno;
    private String chamada;
    
    public Sala(String nomAluno, String chamada) {
        
        this.nomAluno = nomAluno;
        this.chamada = chamada;
    }

    public String getNomAluno() {
        return nomAluno;
    }

    public void setNomAluno(String nomAluno) {
        this.nomAluno = nomAluno;
    }

    public String getChamada() {
        return chamada;
    }

    public void setChamada(String chamada) {
        this.chamada = chamada;
    }
    
    
}
