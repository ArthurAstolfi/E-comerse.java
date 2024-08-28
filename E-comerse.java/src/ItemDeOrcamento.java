public class ItemDeOrcamento {
    private int quantidade;
    private Produto produto;


    public ItemDeOrcamento(){

    }

    public ItemDeOrcamento(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
