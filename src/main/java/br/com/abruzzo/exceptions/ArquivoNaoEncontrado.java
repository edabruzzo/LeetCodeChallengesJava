package br.com.abruzzo.exceptions;

public class ArquivoNaoEncontrado extends Exception {

    private String nomeArquivo;
    private String pathArquivo;

    public ArquivoNaoEncontrado(String message, String nomeArquivo) {
        super(message);
        this.nomeArquivo = nomeArquivo;
        this.pathArquivo = pathArquivo;
    }


    @Override
    public String toString() {
        return "ArquivoNaoEncontrado{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", pathArquivo='" + pathArquivo + '\'' +
                '}';
    }
}
