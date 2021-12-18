package EstruturaDados;

public class Pilha implements IPilha {

    private Node4Stack noReferenciaEntrada;

    public Pilha() {
        this.noReferenciaEntrada = null;
    }


    @Override
    public Node4Stack top(){
        return this.noReferenciaEntrada;
    }


    @Override
    public void push(Node4Stack novoNode){
        Node4Stack auxiliar = this.noReferenciaEntrada;
         this.noReferenciaEntrada = novoNode;
         this.noReferenciaEntrada.setNode4Stack(auxiliar);
    }


    @Override
    public Node4Stack pop(){

        if(!isEmpty()){
            Node4Stack auxiliar = this.noReferenciaEntrada;
            this.noReferenciaEntrada = this.noReferenciaEntrada.getNode4Stack();
            return auxiliar;
        }

        else
            return null;

    }



    @Override
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
