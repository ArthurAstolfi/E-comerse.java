
public class Pagamento {
  private boolean confirmacao;
  private double valorPgto;

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
    return confirmacao;
  }
}
