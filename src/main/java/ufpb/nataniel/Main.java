package org.example;

import java.util.ArrayList;

public class Main {

    private static String[] bubbleSort(String[] vetor){
        for (int i = 0; i < vetor.length - 1; i++){
            for (int k = 0; k < vetor.length - 1; k++){
                if (comparaString(vetor[k], vetor[k+1]) > 0){
                    String aux = vetor[k];
                    vetor[k] = vetor[k+1];
                    vetor[k+1] = aux;
                }
            }
        }
        return vetor;
    }

    private static int comparaString(String s, String s1) {
        // Verifica qual das palavras é a maior e a partir de qual letra elas não são mais iguais.
        String palavraMaior;
        if (s.length() > s1.length()){
            palavraMaior = s;
        } else{
            palavraMaior = s1;
        }
        for (int j = 0; j < palavraMaior.length(); j++){
            if (!(palavraMaior.substring(j,j+1).equals(palavraMaior.substring(j,j+1)))){
                palavraMaior = palavraMaior.substring(j,j+1);
            }
        }
        //*


        // Verifica se a letra é acentuada, se sim faz a troca para letra normal para comparar.
        String[] letrasAcentuadas = {"á","à","â","é","è","ê","í","ó","ô","ú"};
        String[] letrasNormais = {"a","a","a","e","e","e","i","o","o","u"};
        for (int i = 0; i < letrasAcentuadas.length; i++){
            if (letrasAcentuadas[i].equals(s)){
                s = letrasNormais[i];
            }
            if (letrasAcentuadas[i].equals(s1)){
                s1 = letrasNormais[i];
            }
        }
        return s.compareTo(s1);
    }


    public static void main(String[] args) {
        String entrada = "Trabalho de estrutura de dados é muito importante para o aprendizado do aluno".toLowerCase();
        String[] palavras = entrada.split(" ");

        for (String s: bubbleSort(palavras)){
            System.out.println(s);
        }
    }
}