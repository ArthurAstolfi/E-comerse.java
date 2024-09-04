import java.util.ArrayList;

public class Orcamento {
  private int codOrcamento;
  private double valorTotal;
  private ArrayList<ItemDeOrcamento> orcamentos = new ArrayList<>();
  private ArrayList<Pagamento> pagamentos = new ArrayList<>();

  public Orcamento() {}

  public Orcamento(int codOrcamento, double valorTotal) {
    this.codOrcamento = codOrcamento;
    this.valorTotal = valorTotal;
  }

  public int getCodOrcamento() {
    return codOrcamento;
  }

  public void setCodOrcamento(int codOrcamento) {
    this.codOrcamento = codOrcamento;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public boolean adicionarItem(ItemDeOrcamento item) {
    if (orcamentos.add(item)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean  confirmarPagtos(Pagamento pagamento) {
    double sum = 0;
    for (Pagamento pagtos : this.pagamentos) {
      sum+= pagtos.getValorPgto();
      
    }
    return  sum == this.getValorTotal();
  }

  public void encrementaPagtos(Pagamento pagamento) {
    pagamentos.add(pagamento);
  }
}
