package EstruturaDados;

public class Fila implements IFila {

    private Node4Queue nodeReferencia;


    public Fila() {
        this.nodeReferencia = null;
    }


    @Override
    public void enqueue(Node4Queue novoNode){
        novoNode.setNodeReferencia(this.nodeReferencia);
        this.nodeReferencia.setNodeReferencia(novoNode);
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

        if(this.isEmpty()) retorno = "Fila vazia";
        else{
            Node4Queue auxNode;
            while(true) {
                if (this.nodeReferencia.getNodeReferencia() == null)
                    break;
                else {
                    auxNode = nodeReferencia.getNodeReferencia();
                    retorno += String.format("{Node} Dado armazenado: %s {Node}",nodeReferencia.getObject().toString());
                }

            }
        }
        return retorno;
    }
}
