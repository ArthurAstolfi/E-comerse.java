public class Produto {
  private int codProduto;
  private String nomeProduto;
  private double valorProduto;
  private int quantidadeProduto;

  public Produto() {}

  public Produto(int codProduto, String nomeProduto, double valorProduto, int quantidade) {
    this.codProduto = codProduto;
    this.nomeProduto = nomeProduto;
    this.valorProduto = valorProduto;
    this.quantidadeProduto = quantidade;
  }

  public int getCodProduto() {
    return codProduto;
  }

  public void setCodProduto(int codProduto) {
    this.codProduto = codProduto;
  }

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public double getValorProduto() {
    return valorProduto;
  }

  public void setValorProduto(double valorProduto) {
    this.valorProduto = valorProduto;
  }

  public int getQuantidade() {
    return quantidadeProduto;
  }

  public void setQuantidade(int quantidade) {
    this.quantidadeProduto = quantidade;
  }

  public boolean decrementaQuantidade(int numero) {
    if (this.quantidadeProduto < numero) {
      return false;
    } else {
      this.quantidadeProduto -= numero;
      return true;
    }
  }

  public boolean encrementaQuantidade(int numero) {
    this.quantidadeProduto += numero;
    return true;
  }

  public boolean validaEstoque(int quantidade) {
    if (this.quantidadeProduto >= quantidade) {
      return true;

    } else {
      return false;
    }
  }
}
