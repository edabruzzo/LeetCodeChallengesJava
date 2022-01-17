package br.com.abruzzo.manipulacaoFilesStreams;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static br.com.abruzzo.manipulacaoFilesStreams.FileHandlingIO.readFromInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;


class FileHandlingIOTest{


    String nomeArquivoTeste = "/arquivosDebug/entradas.txt";

    String expectedData = "8 160 182\n" +
            "160\n" +
            "182\n" +
            "183\n" +
            "159\n" +
            "250\n" +
            "170\n" +
            "172\n" +
            "173";

    FileHandlingIO fileHandlingIO = new FileHandlingIO();


    @Test
    @Order(1)
    public void givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData() {
        String data = lerInputStreamClassPath(nomeArquivoTeste);
        assertEquals(data, expectedData);
    }


    @Test
    @Order(2)
    public void givenFileNameAsAbsolutePath_whenUsingClassLoader_thenFileData() {
        String data = getStringFromFileWithClassLoader(nomeArquivoTeste);
        assertEquals(data, expectedData);
    }

    private String getStringFromFileWithClassLoader(String nomeArquivo){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(nomeArquivo).getFile());
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return getString(inputStream);
    }

    private String lerInputStreamClassPath(String nomeArquivo) {
        Class clazz = FileHandlingIOTest.class;
        InputStream inputStream = clazz.getResourceAsStream(nomeArquivo);
        return getString(inputStream);
    }


    private String getString(InputStream inputStream) {
        String data = null;
        try {
            data = readFromInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }


    @Test
    void lerTecladoEscreverDocumento() {


    }




}