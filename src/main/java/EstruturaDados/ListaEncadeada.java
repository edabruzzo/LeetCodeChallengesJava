package EstruturaDados;


/**
 * @link https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 * @param <T>
 */
public class ListaEncadeada<T> {


    Node4LinkedList<T> nodeReference;

    public ListaEncadeada() {
        this.nodeReference = null;
    }


    public Node4LinkedList<T> getNode(int index){

        if(indicePesquisadoMaiorTamanhoLista(index))
            return new Node4LinkedList<T>(null);
        Node4LinkedList<T> auxiliarNode = this.nodeReference;
        Node4LinkedList<T> nodeToBereturned = null;

        for(int i=0; i < index; i++){
            nodeToBereturned = auxiliarNode;
            auxiliarNode = auxiliarNode.getNextNode();
        }
        return nodeToBereturned;
    }


    private boolean indicePesquisadoMaiorTamanhoLista(int index) {
        if(index > this.size()){
            try {
                throw new IndexOutOfBoundsException();
            }catch(IndexOutOfBoundsException erro){
                System.out.println(String.format("" +
                                "O índice pesquisado (%d) " +
                                "é maior do que o tamanho da lista encadeada (%d)",
                        index, this.size()));
                return true;
            }
        }else
            return false;
    }


    public T remove(int index){

        if (indicePesquisadoMaiorTamanhoLista(index)) return null;

        Node4LinkedList<T> nodePivot = this.getNode(index);

        if(index == 0){
            nodeReference = nodePivot.getNextNode();
            return nodePivot.getContent();
        }

        if(index > 0 && index < this.size()){

            Node4LinkedList priorNode = this.getNode(index -1);
            priorNode.setNextNode(nodePivot.getNextNode());
            return (T) priorNode.getContent();

        }else return null;

    }


    public void add(T conteudo){

        Node4LinkedList<T> node4LinkedList = new Node4LinkedList<>(conteudo);
        if(this.isEmpty()){
            this.nodeReference = node4LinkedList;
            return ;
        }else{
            Node4LinkedList<T> auxiliarNode = this.nodeReference;
            for(int i=0; i < this.size()-1; i++){
                auxiliarNode = auxiliarNode.getNextNode();
            }
            auxiliarNode.setNextNode(node4LinkedList);
        }
    }


    public boolean isEmpty(){
        return this.nodeReference == null ? true : false;
    }


    public int size(){
        int lengthList = 0;
        Node4LinkedList<T> auxNode = this.nodeReference;

        while(true){
            if(auxNode == null)
                break;
            else{
                lengthList ++;
                if(auxNode.getNextNode() != null)
                    auxNode = auxNode.getNextNode();
                else
                    break;
            }
        }
        return lengthList;
    }


    @Override
    public String toString() {

        String retorno = this.nodeReference.toString();
        Node4LinkedList<T> auxiliarNode = this.nodeReference;

        for(int i=0; i< this.size(); i++){

            retorno += String.format(" %s ---> próximo Nó\n", auxiliarNode.toString());
            auxiliarNode = auxiliarNode.getNextNode();

        }

        return retorno;
    }
}
