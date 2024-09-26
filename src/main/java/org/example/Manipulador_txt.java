package org.example;
import java.io.*;


public class Manipulador_txt {
    private String caminhoArquivo;

    public Manipulador_txt(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    // Método para ler o conteúdo do arquivo e retornar um StringBuild
    public StringBuilder lerArquivo() {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteudo;
    }



    // Método para adicionar conteúdo ao final do arquivo
    public void adicionarAoArquivo(String conteudo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            bw.write(conteudo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivotxt(String nomeArq){
        try{
            File arquivo = new File(nomeArq);
            if (arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso !");
            }
            else {
                System.out.println("Arquivo já criado !");
            }
        }
        catch (IOException e){
            System.out.println("Ocorreu um erro");
            e.printStackTrace();
        }
    }

}
