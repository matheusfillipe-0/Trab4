public class Main {
    public static void main(String[] args) {
        Categoria categoria = new Categoria("Eletrônicos");
        Produto produto = new Produto("Notebook", "303", 10, categoria);


            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getId());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Categoria: " + produto.getCategoria().getTipo());
        }
    }

