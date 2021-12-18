package EstruturaDados;

public class Pilha {

    private Node4Stack noReferenciaEntrada;

    public Pilha() {
        this.noReferenciaEntrada = null;
    }


    public Node4Stack top(){
        return this.noReferenciaEntrada;
    }


    public void push(Node4Stack novoNode){
        Node4Stack auxiliar = this.noReferenciaEntrada;
         this.noReferenciaEntrada = novoNode;
         this.noReferenciaEntrada.setNode4Stack(auxiliar);
    }


    public Node4Stack pop(){

        if(!isEmpty()){
            Node4Stack auxiliar = this.noReferenciaEntrada;
            this.noReferenciaEntrada = this.noReferenciaEntrada.getNode4Stack();
            return auxiliar;
        }

        else
            return null;

    }



    public boolean isEmpty(){
        return noReferenciaEntrada == null ? true : false;
    }


    @Override
    public String toString() {

        Node4Stack noAuxiliar = this.noReferenciaEntrada;

        String informacoesPilha = "";
        System.out.println("--------------------\n");
        while(noAuxiliar.getNode4Stack() != null){
            informacoesPilha = noAuxiliar.toString();
            System.out.println(informacoesPilha);
            noAuxiliar = noAuxiliar.getNode4Stack();

        }
        System.out.println("--------------------\n");

        return informacoesPilha;
    }



}
