public class Produtos {
    String nome;
    int id;
    String descricao;
    int valor;

    public Produtos(String nome,int id,String descricao, int valor) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrição() {
        return descricao;
    }

    public void setDescrição(String descrição) {
        this.descricao = descrição;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
