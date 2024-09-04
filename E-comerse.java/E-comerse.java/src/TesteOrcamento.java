import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TesteOrcamento {
  Orcamento orcamento1;

  @Before
  public void criarOrcamento() {
    orcamento1 = new Orcamento(1, 300);
  }

  @Test
  public void TesteCodOrcamento() {
    Assert.assertEquals(1, orcamento1.getCodOrcamento());
  }

  @Test
  public void TesteValorOrcamento() {
    Assert.assertEquals(300, (int) orcamento1.getValorTotal());
  }
}
