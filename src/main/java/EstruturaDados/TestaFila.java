package EstruturaDados;

public class TestaFila {

    public static void main(String[] args) {

        Fila fila = new Fila();

        for(int i=0; i<11; i++){
            fila.enqueue(new Node4Queue(i));
        }

        System.out.println(fila.toString());

        Node4Queue dequeuedNode = fila.dequeue();
        System.out.println(dequeuedNode.toString());
        System.out.println(fila.toString());

    }

}
