import java.util.ArrayList;

public class Pagamento {
  private boolean confirmacao;
  private double valorPgto;
  private ArrayList<Pagamento> pagamentos = new ArrayList<>();

  public Pagamento(boolean confirmacao, double valorPgto) {
    this.confirmacao = confirmacao;
    this.valorPgto = valorPgto;
  }

  public boolean isConfirmacao() {
    return confirmacao;
  }

  public void setConfirmacao(boolean confirmacao) {
    this.confirmacao = confirmacao;
  }

  public double getValorPgto() {
    return valorPgto;
  }

  public void setValorPgto(double valorPgto) {
    this.valorPgto = valorPgto;
  }

  public boolean ConfirmarPagto() {
    if (confirmacao == false) {
      return false;
    } else {
      return true;
    }
  }
}
