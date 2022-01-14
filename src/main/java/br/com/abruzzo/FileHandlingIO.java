package br.com.abruzzo;

import java.io.*;

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

    public static void main(String[] args) {


    }


    private String readFromInputStream(InputStream inputStream) throws IOException {
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
