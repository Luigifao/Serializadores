package org.example;

public class ArquivoTexto {
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Arquivo{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

    public ArquivoTexto(String conteudo) {
        this.conteudo = conteudo;
    }
}
