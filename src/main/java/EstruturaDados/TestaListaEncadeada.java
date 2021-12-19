package EstruturaDados;

public class TestaListaEncadeada {


    public static void main(String[] args) {

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add("1");
        listaEncadeada.add("2");
        listaEncadeada.add("3");
        listaEncadeada.add("4");


        listaEncadeada.toString();
        System.out.println(listaEncadeada.getNode(4).getContent());
        System.out.println(listaEncadeada.getNode(5).getContent());
        System.out.println("Tamanho lista: "+listaEncadeada.size());
        System.out.println(listaEncadeada.remove(4));
        listaEncadeada.add("5");
        listaEncadeada.toString();
    }


}
