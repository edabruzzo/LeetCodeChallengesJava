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

        String line = lerFromScanner();

        copiarConteudoParaArquivo(printWriter,line,"src/main/resources/recomendacoes.txt");

    }

    private static String lerFromScanner() {
        return scanner.nextLine();

    }

    private static void copiarConteudoParaArquivo(PrintWriter printWriter, String line, String nomeArquivo) throws IOException {

        File file = new File(nomeArquivo);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getName()));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            line = scanner.nextLine();
        } while(!(line.equalsIgnoreCase("fim")));

        printWriter.printf("Arquivo \"%s\" foi criado com sucesso!", file.getName());

        printWriter.close();
        scanner.close();
        bufferedWriter.close();
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
