
import java.util.ArrayList;

public class Orcamento {
  private int codOrcamento;
  private double valorTotal;
  private ArrayList <Orcamento> orcamentos = new ArrayList<>();

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
}
