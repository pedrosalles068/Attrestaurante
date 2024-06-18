public class Comida extends Produto{
    private String Categoria;

    public Comida(String nome, double preco, String descricao, String categoria) {
        super(nome, preco, descricao);
        Categoria = categoria;
    }
}
