package br.com.abruzzo.manipulacaoFilesStreams;

import java.io.*;
import java.util.Scanner;

/**
 *
 * Referência: https://www.baeldung.com/reading-file-in-java
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 14/01/2022
 */
public class FileHandlingIO {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            lerTecladoEscreverDocumento();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Digite 3 recomendações de filmes: ");
        printWriter.flush();

        copiarConteudoParaArquivo(printWriter, "src/main/resources/recomendacoes.txt");

    }

    private static String lerFromScanner() {
        return scanner.nextLine();
    }

    private static void copiarConteudoParaArquivo(PrintWriter printWriter, String nomeArquivo) throws IOException {

        BufferedWriter bufferedWriter = obterBufferedWriter(nomeArquivo);

        String line = null;

        do {
            line = lerFromScanner();
            escreverStringLineArquivo(line, bufferedWriter);

        }while(!line.equalsIgnoreCase("fim"));


        printWriter.printf("Arquivo \"%s\" foi criado com sucesso!", nomeArquivo);
        printWriter.close();
        scanner.close();
        bufferedWriter.close();
    }

    private static BufferedWriter obterBufferedWriter(String nomeArquivo) {

        File file = new File(nomeArquivo);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedWriter;

    }

    private static void escreverStringLineArquivo(String line, BufferedWriter bufferedWriter) throws IOException {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }


    public static String readFromInputStream(InputStream inputStream) throws IOException {

        StringBuilder resultStringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }








}
