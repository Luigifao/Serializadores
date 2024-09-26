package org.example;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
public class Exercicios {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // questao01();
        // questao02();
    }


    public static boolean questao01(){
        try {
        System.out.println("Digite o endereço do arquivo 01: ");
        String path = input.nextLine();
        System.out.println("Digite o endereço do arquivo 02: ");
        String path2 = input.nextLine();
        Manipulador_txt arquivo0 = new Manipulador_txt(path);
        Manipulador_txt arquivo1 = new Manipulador_txt(path);
        StringBuilder conteudos = arquivo1.lerArquivo();
        conteudos.append(arquivo1);
        return true;
        }
        catch (Exception e){
            System.out.println("Ocorreu o seguinte erro: \n"+e.getMessage());
            return false;
        }

    }
    public static boolean questao02(){
        Object[][] data; String nome; float nota;
        while(true){
        System.out.println("Digite o nome: ");
        nome = input.nextLine();
        }
    }


}
