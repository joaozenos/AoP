package core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.lang.Runtime;

public class Run{

    public static void printMenu(int id){


        if(id == 1){

            System.out.println("1 - Criações");
            System.out.println("2 - Deletar Base de dados :)");
            System.out.println("0 - Sair");
        } else{


            System.out.println("1 - Criação de Produto");
            System.out.println("2 - Criação de Servico");
            System.out.println("3 - Criação de Funcionario");
            System.out.println("0 - Sair");
        }

    }

    public static Produto criarProduto(){
    	
    	Produto pd = new Produto();
    	
    	String id = "1";
    	double preco = 2.40;
    	Date date = new Date(10,12, 10);
    	String tag = "Talco";
    	Categoria cat = Categoria.higiene;

    	pd.setId(id);
    	pd.setPreco(preco);
    	pd.setValidade(date);
    	pd.setCategoria(cat);
    	pd.setTag(tag);

        return pd;
    }

    public static Funcionario criarFunc(){
        Funcionario fc = new Funcionario();
    	
    	System.out.println("Criação de Funcionario");
        String nome = "José";
        String id = "1";
        String cargo = "Vendedor";

        fc.
        
        return new Funcionario(nome, id, cargo);

    }

    public static Servico criarServ(){
        String id = "1";
        double preco = 230.00;
        String tag = "Banho";

        return new Servico(id, preco, tag, criarFunc());
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

//      Repos
        List<Produto> produtos = new ArrayList<Produto>();
        List<Servico> servicos = new ArrayList<Servico>();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        boolean cont = true;

        while(cont){
            printMenu(1);
            int inp = sc.nextInt();
            
            if(inp == 1) {
            	
            	Runtime.getRuntime().exec("clear");
                System.out.println("\nCriação");
                printMenu(2);
                int newinp = sc.nextInt();
                if(newinp == 1){
                	Runtime.getRuntime().exec("clear");
                    System.out.println("\nCriação de Produto");
                    produtos.add(criarProduto());
                    
                    System.out.println("\nProduto criado com sucesso!\n\n");

                }else if(newinp == 2){
                	Runtime.getRuntime().exec("clear");
                    System.out.println("\nCriação de Serviço");
                    servicos.add(criarServ());

                    System.out.println("\nServiço criado com sucesso!\n\n");
                    
                }else if(newinp == 3) {
                	Runtime.getRuntime().exec("clear");
                    System.out.println("\nCriação de Funcionario");
                    funcionarios.add(criarFunc());

                    System.out.println("\nFuncionario cadastrado com sucesso!\n\n");
                    
                }else if(newinp == 0){
                	Runtime.getRuntime().exec("clear");
                    cont = false;
                    System.out.println("Bye!\n");
                }else{
                    System.out.println("\nTentete outra opcao!\n");
                }

            }else if(inp == 2){
            	Runtime.getRuntime().exec("clear");
                System.out.println("\nDeletar Banco - hihi");
                produtos = new ArrayList<Produto>();
                servicos = new ArrayList<Servico>();
                funcionarios = new ArrayList<Funcionario>();

                System.out.println("Banco deletado com sucesso :)\n\n");

            }else if(inp == 0){
            	Runtime.getRuntime().exec("clear");
                cont = false;
                System.out.println("Bye!\n");
            }else{
            	Runtime.getRuntime().exec("cls");
                System.out.println("Tente outra opcao!");
            }

        }

    }

}
