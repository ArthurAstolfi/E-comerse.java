import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteProduto {
  Produto produto1;

  @Before
  public void criaProduto() {
    produto1 = new Produto(1, "mouse", 65, 30);
  }

  @Test
  public void testeCodigo() {
    Assert.assertEquals(1, produto1.getCodProduto());
  }

  @Test
  public void testeNome() {
    Assert.assertEquals("mouse", produto1.getNomeProduto());
  }

  @Test
  public void testePreco() {
    Assert.assertEquals(65, (int) produto1.getValorProduto());
  }

  @Test
  public void testeQuantidade() {
    Assert.assertEquals(30, produto1.getQuantidade());
  }

  @Test
  public void testaDecremento() {
    produto1.decrementaQuantidade(20);
    Assert.assertEquals(10, produto1.getQuantidade());
  }

  @Test
  public void testaEncremento() {
    produto1.encrementaQuantidade(30);
    Assert.assertEquals(60, produto1.getQuantidade());
  }
}
