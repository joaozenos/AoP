package core;

import java.util.Date;

/**
 * Created by joaoluiz on 6/22/17.
 */
public class Servico extends Basico {
    public Funcionario funcionario;
    
    public Servico(){
    	
    }

    public Servico(String id, double preco, String tag, Funcionario funcionario){
        super.setId(id);
        super.setPreco(preco);
        super.setTag(tag);
        this.funcionario = funcionario;
    }

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
    
    
    
}
