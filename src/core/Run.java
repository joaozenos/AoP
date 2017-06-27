package core;

import com.sun.org.apache.bcel.internal.generic.FNEG;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Run{

    public static void printMenu(int id){


        if(id == 1){

            System.out.println("1 - Criações");
            System.out.println("2 - Deletar Base de dados :)");
            System.out.println("sair - Sair");
        } else{

            System.out.println("1 - Criação de Produto");
            System.out.println("2 - Criação de Servico");
            System.out.println("3 - Criação de Funcionario");
            System.out.println("sair - Sair");
        }

    }


    public static Produto criarProduto(){
        String id = "1";
        double preco = 2.40;
        Date date = new Date(10,12, 10);
        String tag = "Talco";
        Categoria cat = Categoria.higiene;

        return new Produto(id, preco, tag, cat, date);
    }


    public static Funcionario criarFunc(){
        System.out.println("Criação de Funcionario");
        String nome = "José";
        String id = "1";
        String cargo = "Vendedor";

        return new Funcionario(nome, id, cargo);

    }

    public static Servico criarServ(){
        String id = "1";
        double preco = 230.00;
        String tag = "Banho";

        return new Servico(id, preco, tag, criarFunc());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//      Repos
        List<Produto> produtos = new ArrayList<Produto>();
        List<Servico> servicos = new ArrayList<Servico>();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        boolean cont = true;

        while(cont){
            printMenu(1);
            sc.next();
            String inp = sc.nextLine();
            sc.useDelimiter("\\n");

            if(inp.equals("1")) {
                System.out.println("Criação");
                printMenu(2);
                if(inp.equals("1")){
                    System.out.println("Criação de Produto");
                    produtos.add(criarProduto());

                }else if(inp.equals("2")){
                    System.out.println("Criação de Serviço");
                    servicos.add(criarServ());

                }else if(inp.equals("3")) {
                    System.out.println("Criação de Funcionario");
                    funcionarios.add(criarFunc());

                }else if(inp.equalsIgnoreCase("sair")){
                    cont = false;
                }else{
                    System.out.println("Tente outra opcao!");
                }

            }else if(inp.equals("2")){
                System.out.println("Deletar Banco - hihi");
                produtos = new ArrayList<Produto>();
                servicos = new ArrayList<Servico>();
                funcionarios = new ArrayList<Funcionario>();

                System.out.println("Banco deletado com sucesso :)");

            }else if(inp.equalsIgnoreCase("sair")){
                cont = false;
            }else{
                System.out.println("Tente outra opcao!");
            }

        }

    }

}
