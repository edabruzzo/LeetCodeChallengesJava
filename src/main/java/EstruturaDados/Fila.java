package EstruturaDados;

public class Fila<T> implements IFila {

    private Node4Queue nodeReferencia;

    public Fila() {
        this.nodeReferencia = nodeReferencia;
    }

    @Override
    public void enqueue(Node4Queue novoNode) {
        novoNode.setNodeReferencia(this.nodeReferencia);
        this.nodeReferencia = novoNode;
    }




    @Override
    public Node4Queue dequeue(){

        if(! this.isEmpty()){
            Node4Queue firstNode = this.nodeReferencia;
            Node4Queue auxNode = this.nodeReferencia;
            while(true){
                if(firstNode.getNodeReferencia() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNodeReferencia();
                } else{
                    // cheguei no primeiro da fila e a
                    auxNode.setNodeReferencia(null);
                    break;
                }
                return firstNode;
            }
        }
        return null;
    }


    @Override
    public boolean isEmpty(){
        return this.nodeReferencia == null ? true : false;
    }


    @Override
    public String toString() {

        String retorno = "";

        Node4Queue nodeAux = this.nodeReferencia;
        if(! this.isEmpty()){

            while(true){
                retorno += String.format("Node --> armazena o seguinte objeto --> %s\n", nodeAux.getObject().toString());

                if(nodeAux.getNodeReferencia() == null){
                    retorno += "Último nó";
                    break;
                }
                else
                    nodeAux = nodeAux.getNodeReferencia();

            }

        }else
            retorno = "Fila vazia";

        return retorno;
    }
}
