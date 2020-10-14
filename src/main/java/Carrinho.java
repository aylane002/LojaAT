import java.util.ArrayList;

public class Carrinho {
    ArrayList <Produtos> produtos;

    public  Carrinho() {
        produtos = new ArrayList<>();
    }
    public  Carrinho(ArrayList <Produtos> produtos) {
       this.produtos = produtos;
    }

    public ArrayList<Produtos> getProdutos(int id) {
        return produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }
}
