package core;


public abstract class Basico {
    private String id;
    private double preco;
    private String tag;

    public String getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public String getTag() {
        return tag;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
