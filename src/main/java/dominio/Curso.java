package dominio;

import java.time.LocalDate;

public class Curso {
    private String mentoria;
    private String descricao;
    private int cargaHoraria;

    public Curso(String mentoria, String descricao, int cargaHoraria) {
        this.mentoria = mentoria;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getMentoria() {
        return mentoria;
    }

    public void setMentoria(String mentoria) {
        this.mentoria = mentoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "mentoria='" + mentoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
