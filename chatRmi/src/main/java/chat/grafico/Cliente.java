/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat.grafico;

import chat.grafico.Conversa;
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
        this.mensagem=mensagem;
        return mensagem;
    }
    public String mensagemRecebida(){
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
    
}
