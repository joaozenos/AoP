package core;


public class Funcionario {

	public String nome;
    public String id;
    public String cargo;

    public Funcionario(){
    	
    }
    
    public Funcionario (String nome, String id, String cargo) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
