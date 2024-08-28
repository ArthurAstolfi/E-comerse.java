public class MeioDePgto {
    private static final int numMaxDeParcelas = 3;
    private String nomePagto;
    private int numParcelas;
    private double taxacartao;
    
    public MeioDePgto(String nomePagto, int numParcelas, double taxacartao) {
        this.nomePagto = nomePagto;
        this.numParcelas = numParcelas;
        this.taxacartao = taxacartao;
    }

    public static int getNummaxdeparcelas() {
        return numMaxDeParcelas;
    }

    public String getNomePagto() {
        return nomePagto;
    }

    public void setNomePagto(String nomePagto) {
        this.nomePagto = nomePagto;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public double getTaxacartao() {
        return taxacartao;
    }

    public void setTaxacartao(double taxacartao) {
        this.taxacartao = taxacartao;
    }

    

}
