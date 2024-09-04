import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TesteMeiodePagto {
  MeioDePgto meio1;

  @Before
  public void criarMeioPagto() {
    meio1 = new MeioDePgto("Cartão de crédito", 2, 0.3);
  }

  @Test
  public void testeNome(){
    Assert.assertEquals("Cartão de crédito", meio1.getNomePagto());
  }

  @Test
  public void testeNumParcelas(){
    Assert.assertEquals(2, meio1.getNumParcelas());
  }

  
@SuppressWarnings("deprecation")
@Test
  public  void testeTaxa(){
    Assert.assertEquals(0.3,meio1.getTaxacartao())

}
