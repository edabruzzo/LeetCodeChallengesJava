package br.com.abruzzo.manipulacaoFilesStreams;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.Objects;
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

        /*
        try {
            lerTecladoEscreverDocumento();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


        try {
            copiarArquivo();
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


    public static void copiarArquivo() throws IOException {

        String nomeArquivoOriginal = "/home/usuario/IdeaProjects/LeetCodeChallengesJava/src/main/resources/teste.txt";

        String nomeArquivoOriginal2 = null;
        try {
            nomeArquivoOriginal2 = String.valueOf(Paths.get(FileHandlingIO.class.getResource("/teste.txt").toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("Nomes são iguais %s", Objects.equals(nomeArquivoOriginal,nomeArquivoOriginal2)));


        BufferedReader bufferedReader = obterBufferedReader(nomeArquivoOriginal);
        String line = bufferedReader.readLine();

        String nomeArquivoCopia = nomeArquivoOriginal.substring(0, nomeArquivoOriginal.indexOf(".")).concat("-copy.txt");
        BufferedWriter bw = obterBufferedWriter(nomeArquivoCopia);

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = bufferedReader.readLine();
        }while(!(line == null));

        int bytesArquivoOriginal = obterTamanhoArquivo(nomeArquivoOriginal);
        int bytesArquivoCopiado = obterTamanhoArquivo(nomeArquivoCopia);

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", nomeArquivoOriginal, bytesArquivoOriginal);
        System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho '%d' bytes.\n", nomeArquivoCopia, bytesArquivoCopiado);

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(nomeArquivoCopia);

        pw.printf("Ok! Tudo certo. Tamanho do arquivo '%d' bytes.", obterTamanhoArquivo(nomeArquivoCopia));

        bufferedReader.close();
        bw.close();
        pw.close();


    }

    private static int obterTamanhoArquivo(String nomeArquivo) {
        File arquivo = null;
        try {
            arquivo = new File(nomeArquivo);
        }catch(Exception e){
            e.printStackTrace();
        }

        return (int) arquivo.length();

    }

    private static BufferedReader obterBufferedReader(String pathArquivo) {

        File arquivoTeste = new File(pathArquivo);

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(arquivoTeste));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }



    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(!(line.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }

}