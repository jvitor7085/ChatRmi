/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat.grafico;


import chat.conversa.Servidor;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class Cliente {
    private String nome ="Sem Nome";
    private int id=0;
    private String mensagem;
    Servidor server=new Servidor();
//    Conversa cv=new Conversa();
    //Cliente[] clientes=new Cliente[5];
   
    //Ainda preciso adicionar a checagem, no momento só dá true e vida que segue
        public Boolean checagem(String nome){
            if(this.id <5){
                this.id++;
                //JOptionPane.showMessageDialog(null,"Foi guardado com sucesson "+getNome()+getId());
                return true;
            }else
                return false;

    }
    public void mensagemEnviada(String mensagem){
        //Esse método encaminha a mensagem escrita para o servidor, mas para
        //meus testes,ele salvar em uma String interna
        String texto=server.trocaMsg(mensagem, getNome());
        this.mensagem=texto;

    }
    //Metodo que ira receber a mensagem quando o servidor encaminhar para  outro cliente
   // public String mensagemRecebida(String msg){
   //     return msg;
   // }
    //metodo que exibe a mensagem, essa parte ainda não está pronta
    //public String exibirMensagem(){
    //   return mensagem;  
    //}

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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    
    
}
