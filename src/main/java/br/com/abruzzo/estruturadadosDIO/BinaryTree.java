package br.com.abruzzo.estruturadadosDIO;

public class BinaryTree<T extends Comparable<T>> {


    private Node4BinaryTree<T> root;


    public void insert(T content) {
        Node4BinaryTree<T> node = new Node4BinaryTree<>(content);
        this.root = insert(this.root, node);
    }

    private Node4BinaryTree<T> insert(Node4BinaryTree<T> root, Node4BinaryTree<T> node) {

        if (root == null) return node;
        else {
            if (node.getContent().compareTo(root.getContent()) < 0)
                root.setLeftNode(insert(root.getLeftNode(), node));

            if (node.getContent().compareTo(root.getContent()) > 0)
                root.setRightNode(insert(root.getRightNode(), node));

            return root;
        }

    }


    public void traverseTree() {
        System.out.println("--------------------------\n");
        System.out.println("Exibição em pré-ordem");
        this.traverseTree(this.root, 1);
        System.out.println("--------------------------\n");

        System.out.println("--------------------------\n");
        System.out.println("Exibição em ordem");
        this.traverseTree(this.root, 2);
        System.out.println("--------------------------\n");

        System.out.println("--------------------------\n");
        System.out.println("Exibição em pós-ordem");
        this.traverseTree(this.root, 2);
        System.out.println("--------------------------\n");

    }

    /**
     * Pré-ordem = 1
     * Em ordem = 2
     * Pós ordem = 3
     */
    private void traverseTree(Node4BinaryTree<T> root, int order) {
        if (root != null) {
            if (order == 1) {
                System.out.println(root.getContent());
                traverseTree(root.getLeftNode(), order);
                traverseTree(root.getRightNode(), order);

            } else if (order == 2) {
                traverseTree(root.getLeftNode(), order);
                System.out.println(root.getContent());
                traverseTree(root.getRightNode(), order);
            } else if (order == 3) {
                traverseTree(root.getLeftNode(), order);
                traverseTree(root.getRightNode(), order);
                System.out.println(root.getContent());
            } else {
                try {
                    throw new UnsupportedOperationException();
                } catch (UnsupportedOperationException exception) {
                    System.out.println("Operação não suportada");
                }
            }
        }
    }


    public Node4BinaryTree<T> remove(T content) {
        return remove(this.root, content);
    }


    /**
     * @link https://medium.com/swlh/java-how-to-delete-a-node-in-binary-search-tree-aa2d4befe728
     * @link https://github.com/jrdutra/estruturaDeDadosJavaDio/blob/main/projetos/Aula7/arvoreBinaria/src/main/java/one/digitalinnovation/ArvoreBinaria.java
     * @param currentNode
     * @param content
     * @return
     */
    private Node4BinaryTree<T> remove(Node4BinaryTree<T> currentNode, T content) {

        currentNode = this.root;
        if (currentNode == null) return currentNode;

        if (content.compareTo(currentNode.getContent()) > 0)
            currentNode.setRightNode(remove(currentNode.getRightNode(), content));

        else if (content.compareTo(currentNode.getContent()) < 0)
            currentNode.setLeftNode(remove(currentNode.getLeftNode(), content));

        else {

            if(currentNode.getLeftNode() == null && currentNode.getRightNode() == null)
                currentNode = null;
            else if (currentNode.getRightNode() != null) {
                currentNode.setContent(sucessor(currentNode));
                currentNode.setRightNode(remove(currentNode.getRightNode(), currentNode.getContent()));
            }else{
                currentNode.setContent(predecessor(currentNode));
                currentNode.setLeftNode(remove(currentNode.getLeftNode(), currentNode.getContent()));
            }

        }

            return currentNode;
    }

    private T sucessor(Node4BinaryTree<T> currentNode) {
            currentNode = currentNode.getRightNode();
            while(currentNode.getLeftNode() != null){
                currentNode = currentNode.getLeftNode();
            }
            return currentNode.getContent();
    }

    private T predecessor(Node4BinaryTree<T> currentNode) {
        currentNode = currentNode.getLeftNode();
        while(currentNode.getRightNode() != null){
            currentNode = currentNode.getRightNode();
        }
        return currentNode.getContent();
    }

}
