package dominio;

import java.time.LocalDate;

public class Mentoria {
    private String mentoria;
    private String descricao;
    private LocalDate data;

    public Mentoria(String mentoria, String descricao) {
        this.mentoria = mentoria;
        this.descricao = descricao;
        this.data = LocalDate.now();
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "mentoria='" + mentoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
