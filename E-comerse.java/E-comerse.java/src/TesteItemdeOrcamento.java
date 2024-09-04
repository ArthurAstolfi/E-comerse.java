import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class TesteItemdeOrcamento {
    ItemDeOrcamento item1;
    Produto produto1;
    @Before
    public void criaItem(){
        produto1 = new Produto(1, "teclado", 500, 30);
        item1 = new ItemDeOrcamento(20, produto1);
    }

    @Test
    public void testeGetQuantidade(){
        Assert.assertEquals(20, item1.getQuantidade());
    }


}
