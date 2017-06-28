package core;

import java.util.Date;

public class Produto extends Basico{

    public Categoria categoria;
    public Date validade;

    public Produto(){
    	
    }
    
    public Produto(String id, double preco, String tag, Categoria category, Date expirationDate){
        super.setId(id);
        super.setPreco(preco);
        super.setTag(tag);
        this.categoria = category;
        this.validade = expirationDate;
    }

    public Enum getCategoria() {
        return categoria;
    }

    public Date getValidade() {
        return validade;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}
