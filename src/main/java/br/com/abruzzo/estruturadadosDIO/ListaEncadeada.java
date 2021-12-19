package br.com.abruzzo.estruturadadosDIO;


/**
 * @link https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 * @param <T>
 */
public class ListaEncadeada<T> implements IListaEncadeada<T> {


    Node4LinkedListAndCircularList<T> nodeReference;

    public ListaEncadeada() {
        this.nodeReference = null;
    }


    @Override
    public Node4LinkedListAndCircularList<T> getNode(int index){

        if(indicePesquisadoMaiorTamanhoLista(index))
            return new Node4LinkedListAndCircularList<T>(null);
        Node4LinkedListAndCircularList<T> auxiliarNode = this.nodeReference;
        Node4LinkedListAndCircularList<T> nodeToBereturned = null;

        for(int i=0; i < index; i++){
            nodeToBereturned = auxiliarNode;
            auxiliarNode = auxiliarNode.getNextNode();
        }
        return nodeToBereturned;
    }


    @Override
    public T remove(int index){

        if (indicePesquisadoMaiorTamanhoLista(index)) return null;

        Node4LinkedListAndCircularList<T> nodePivot = this.getNode(index);

        if(index == 0){
            nodeReference = nodePivot.getNextNode();
            return nodePivot.getContent();
        }

        if(index > 0 && index < this.size()){

            Node4LinkedListAndCircularList priorNode = this.getNode(index -1);
            priorNode.setNextNode(nodePivot.getNextNode());
            return (T) priorNode.getContent();

        }else return null;

    }


    @Override
    public void add(T conteudo){

        Node4LinkedListAndCircularList<T> node4LinkedList = new Node4LinkedListAndCircularList<>(conteudo);
        if(this.isEmpty()){
            this.nodeReference = node4LinkedList;
            return ;
        }else{
            Node4LinkedListAndCircularList<T> auxiliarNode = this.nodeReference;
            for(int i=0; i < this.size()-1; i++){
                auxiliarNode = auxiliarNode.getNextNode();
            }
            auxiliarNode.setNextNode(node4LinkedList);
        }
    }


    @Override
    public boolean isEmpty(){
        return this.nodeReference == null ? true : false;
    }


    @Override
    public int size(){
        int lengthList = 0;
        Node4LinkedListAndCircularList<T> auxNode = this.nodeReference;

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
        Node4LinkedListAndCircularList<T> auxiliarNode = this.nodeReference;

        for(int i=0; i< this.size(); i++){

            retorno += String.format(" %s ---> próximo Nó\n", auxiliarNode.toString());
            auxiliarNode = auxiliarNode.getNextNode();

        }

        return retorno;
    }
}
