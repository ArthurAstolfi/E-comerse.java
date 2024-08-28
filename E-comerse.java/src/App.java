

public class App {
    public static void main(String[] args) throws Exception {
        
       Clientes cliente = new Clientes(1,"Arthur Astolfi", "70005496616");
        System.out.println(cliente);

        Produto produto = new Produto (5,"teclado",89,300);
        System.out.println(produto);
        
        Categoria categoria = new Categoria(3,"perifericos", "tecnologia");
        System.out.println(categoria);

        Endereco endereco = new Endereco(10,"rua radio", 20,"apto 1402 bl 1", "Serra",30240210,"Belo Horizonte", "Minas Gerais" );
        System.out.println(endereco);
    }
}
