public class Bebida extends Produto{
    String Tamanho;
    String Tipo;

    public Bebida(String nome, double preco, String descricao, String tamanho, String tipo) {
        super(nome, preco, descricao);
        Tamanho = tamanho;
        Tipo = tipo;
    }
}
