package EstruturaDados;

public class TestaPilha {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        for(int i=0; i<11; i++){
            pilha.push(new Node4Stack(i));
        }

        System.out.println(pilha.toString());

        Node4Stack poppedNode = pilha.pop();
        System.out.println(poppedNode.toString());

        System.out.println(pilha.toString());

    }

}
