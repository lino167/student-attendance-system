package POP;

import java.util.Date;

public class Sala {
    private String  data;
    private String nomAluno;
    private String chamada;
    
    public Sala(String data, String nomAluno, String chamada) {
        this.data = data;
        this.nomAluno = nomAluno;
        this.chamada = chamada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
