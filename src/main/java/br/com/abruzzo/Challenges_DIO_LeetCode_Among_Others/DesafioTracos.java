package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

/**
 *
 *
 * Desafio
 * O seu instrutor de lógica de programação, Damilson Bonetti, quer que você desenvolva uma tela com as seguintes características:
 *
 * Conter 39 traços horizontais ( - ) na primeira linha;
 * Conter um traço vertical ( | ) embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com espaço em branco;
 * Repita o procedimento 2 quatro vezes;
 * Repita o procedimento 1.
 * No final deve ficar igual a imagem a seguir:
 *
 * --------------------------------------- (39 traços)
 *
 * |                                     |
 *
 * |                                     |
 *
 * |                                     |
 *
 * |                                     |
 *
 * |                                     |
 *
 * --------------------------------------- (39 traços)
 *
 * Entrada
 * Não há.
 *
 * Saída
 * A saída será impresso conforme a figura acima.
 *
 *
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 20/01/2022
 */
public class DesafioTracos {


    public static void main(String[] args) {
        resolucao1();
        resolucao2();
    }


    private static void resolucao2() {

        String desenhoTela = "-";

        for(int i=0; i<38; i++){
            desenhoTela += "-";
        }

        desenhoTela += "\n";

        for(int j = 0; j<=4; j++ ){

            for(int i=0; i<39; i++){
                if(i==0 | i==38)
                    desenhoTela += "|";
                else
                    desenhoTela+=" ";
            }
            desenhoTela += "\n";

        }

        for(int i=0; i<39; i++){
            desenhoTela += "-";
        }

        System.out.println(desenhoTela);

    }



    /**
     * Solução implementada no método abaixo foi encontrada nesse link abaixo
     * https://github.com/eduardo-mior/URI-Online-Judge-Solutions/blob/master/Iniciante/URI%202747.java
     */
    private static void resolucao1() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 39; j++) {
                if (i == 1 || i == 7)
                    System.out.print("-");
                else if (j == 1 || j == 39)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }


    }