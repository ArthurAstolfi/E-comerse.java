public class App {
  public static void main(String[] args) throws Exception {

    Clientes cliente = new Clientes(1, "Arthur Astolfi", "70005496616");
    System.out.println(cliente);

    System.out.println("---------------------------------------------------");

    Clientes cliente2 = new Clientes(2, "Bernardo Guedes", "00528717626");
    System.out.println(cliente2);
    System.out.println("---------------------------------------------------");

    Produto produto = new Produto(5, "teclado", 89, 300);
    System.out.println(produto);
    System.out.println("---------------------------------------------------");

    Categoria categoria = new Categoria(3, "perifericos", "tecnologia");
    System.out.println(categoria);
    System.out.println("---------------------------------------------------");

    Endereco endereco =
        new Endereco(
            10,
            "rua radio",
            20,
            "apto 1402 bl 1",
            "Serra",
            30240210,
            "Belo Horizonte",
            "Minas Gerais");
    System.out.println(endereco);
  }
}
