import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePagamento {
  Pagamento pagamento1;

  @Before
  public void criaPagamento() {
    pagamento1 = new Pagamento(true, 300);
  }

  @Test
  public void testeConfirmacao() {
    Assert.assertTrue(true);
  }

  @SuppressWarnings("deprecation")
@Test
 public void testeValorPagto(){
    Assert.assertEquals(300, pagamento1.getValorPgto());
}   
