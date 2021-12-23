package br.com.abruzzo.estruturadadosDIO;

import java.util.Objects;

public class Livro {

    private String autor;
    private String nome;
    private Integer paginas;


    public Livro(String autor, String nome, Integer paginas) {
        this.autor = autor;
        this.nome = nome;
        this.paginas = paginas;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(autor, livro.autor) && Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, nome, paginas);
    }


    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

