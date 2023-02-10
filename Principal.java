import java.util.Objects;

public class Principal {
    public static void main(String[] args) {

        LinkedList lista = new LinkedList();


        lista.adicionar("Milho");
        lista.adicionar("Rato");
        lista.adicionar("Cobra");
        lista.adicionar("Coruja");


        System.out.println(lista.imprimir());

        lista.addInicio("Nutriente da terra");
        System.out.println(lista.imprimir());

        System.out.println(lista.BuscarElemento("Rato"));

        lista.removerNo("Cobra");

        System.out.println(lista.imprimir());


    }
}
