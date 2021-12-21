package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

public class TesteTemp {

    public static void main(String[] args) {
        int count = 0;
        String traco = ("-");
        for(int i = 0; i <=39; i++){
            System.out.print(traco);
        }
        int countBlanq = 0;
        do {
            String space = ("\n ");
            System.out.print(space);
            System.out.print("|                                     |"  );
            System.out.print(space);

            countBlanq++;
        }while(countBlanq < 4);

        for(int i = 0; i <=39; i++) {
            System.out.print(traco);
        }

    }
}
