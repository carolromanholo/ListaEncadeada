public class LinkedList {

    private Node primeiro;
    private Node ultimo;
    private int tamanho;

    public void adicionar(String valor){
        Node node = new Node();
        node.setvalor(valor);
        if(this.tamanho==0){
            this.primeiro = node;
        }else{
            this.ultimo.setproximo(node);
        }
        this.ultimo = node;
        this.tamanho++;

    }
    public boolean isVazia() {
        return (primeiro == null && ultimo == null);
    }


    public void limpar(){
        for(Node atual = this.primeiro;atual!=null;){
            Node proximo = atual.getproximo();
            atual.setvalor(null);
            atual.setproximo(null);
            atual = proximo;
        }
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }


    ///adicionar metedo na apresentação
    public void addInicio(String o) {
        tamanho++;
        Node novoNo = new Node();
        novoNo.setvalor(o);
        if (isVazia())
            ultimo = novoNo;
        else
            novoNo.setproximo(primeiro);
        primeiro = novoNo;
    }


    ///adicionar metodo na aopresentação
    public String BuscarElemento (String valor)
    {
        int i = 1;
        Node noTemp = primeiro;

        while (noTemp !=null) {
            if(noTemp.getvalor().equals(valor)) {
                return noTemp.getvalor();
            }
            i = i +1;
            noTemp = noTemp.getproximo();
        }
        return null;
    }



    ///Adicionar metodo na apresentação
    public void removerNo(String elemento)
    {
        Node noTemp = primeiro;
        Node noAnt = null;

        if (primeiro.getvalor().equals(elemento))	{
            primeiro = primeiro.getproximo();
            tamanho--;
        }
        else {
            while (noTemp !=null && !noTemp.getvalor().equals(elemento)) {
                noAnt = noTemp;
                noTemp = noTemp.getproximo();
            }
            if(noTemp != null) {
                noAnt.setproximo(noTemp.getproximo());
                tamanho--;
            }
            if(noTemp == ultimo) {
                ultimo = noAnt;
            }
        }
    }

    public String imprimir() {
        String s = "[";
        if(this.tamanho==0){
            s = "[/]";
            return s;
        }else {
            Node p = primeiro;
            while (p != null) {
                s+=p.getvalor() + " -> ";
                p = p.getproximo();
                if(p==null)s+="NULL";
            }

            s+= "]";
            return s;

        }




    }

}
