package br.com.abruzzo.exceptions;

import javax.swing.*;
import java.io.*;

public class Customizada1 {



    public static void main(String[] args){
        String nomeArquivo = JOptionPane.showInputDialog("Ditgite o nome do arquivo");
        imprimirArquivoConsole(nomeArquivo);
    }

    private static void imprimirArquivoConsole(String nomeArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ArquivoNaoEncontrado e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            //e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }



    private static BufferedReader lerArquivo(String nomeArquivo) throws ArquivoNaoEncontrado {

        File arquivo = new File(nomeArquivo);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(arquivo));
        } catch (FileNotFoundException e) {
            throw new ArquivoNaoEncontrado(arquivo.getName(), arquivo.getPath());
        }
        return bufferedReader;
    }

}
