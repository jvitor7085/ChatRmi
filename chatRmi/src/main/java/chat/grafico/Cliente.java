/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat.grafico;

import chat.conversa.TrocaMensagens;
import chat.grafico.Conversa;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class Cliente {
    private String nome;
    private int id;
    private String mensagem;
    Cliente[] cli=new Cliente[5];
   
        public Boolean SalvarNomeId(String nome, int id){
            if(this.id != id){
                this.id=id;
                this.nome=nome;
                JOptionPane.showInputDialog("Foi guardado com sucesso");
                return true;
            }else
                return false;

    }
    public String mensagemEnviada(String mensagem,int id){
        //Esse método encaminha a mensagem escrita para o servidor, mas para
        //meus testes,ele irá encaminhar diretamente para a interface gráfica
        this.setMensagem(mensagem);
        
        return mensagem;
    }
    public String mensagemRecebida(String msg){
        return "vácuo!!!";
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

    public Cliente[] getCli() {
        return cli;
    }

    public void setCli(Cliente[] cli) {
        this.cli = cli;
    }

	public static void main(String[] args) {
		
		String host = (args.length < 1) ? null : args[0];

		try {
			
			//Obtém o stub para registro
			Registry registry = LocateRegistry.getRegistry(host);
			
			//Obtém o stub para o objeto remoto (Ola) do registro.
			TrocaMensagens stub = (TrocaMensagens) registry.lookup("TrocaMensagens");

				
			//Exemplo de invocação do método remoto
			stub.TrocaMsg("aaaaaaaaaaaa");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erro do cliente: " + e.toString());
		}
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}  
}
