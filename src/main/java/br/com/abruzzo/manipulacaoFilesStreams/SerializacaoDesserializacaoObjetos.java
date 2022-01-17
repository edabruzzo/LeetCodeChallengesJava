package br.com.abruzzo.manipulacaoFilesStreams;

import java.io.*;

/**
 * @author Emmanuel Abruzzo
 * @date 17/01/2022
 */
public class SerializacaoDesserializacaoObjetos {

    static String nomeArquivo = "gato-objeto-serializado";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        serializacao(nomeArquivo);
        desserializacao(nomeArquivo);

    }


    public static void serializacao(String nomeArquivo) throws IOException {

        File f = new File(nomeArquivo);

        if(! f.exists()){

            Gato gato = new Gato("Simba", 6, "amarelado", true, false);


            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f.getName()));
            objectOutputStream.writeObject(gato);

            PrintStream ps = new PrintStream(System.out);
            ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes." , f.getName(), f.length());

            objectOutputStream.close();
            ps.close();


        }

    }



    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) objectInputStream.readObject();

        System.out.printf("\nNome..................: %s\n", objetoGato.getNome());
        System.out.printf("Ronrona................: %s\n", objetoGato.isRonrona());
        System.out.printf("Idade...................: %d\n", objetoGato.getIdade());
        System.out.printf("Cor.....................: %s\n", objetoGato.getCor());
        System.out.printf("Castrado................: %s\n", objetoGato.isCastrado());

        System.out.println(objetoGato);

        objectInputStream.close();

    }

}