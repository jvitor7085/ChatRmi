/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat.conversa;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import chat.grafico.Cliente;

/**
 *
 * @author Vitor
 */
public class Servidor implements TrocaMensagens {
	Cliente cl=new Cliente();

	@Override
	public String TrocaMsg(String mensagem) throws RemoteException {
		cl.mensagemRecebida(cl.getNome()+": "+mensagem);
		
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		try {

			// Criação do objeto remoto
			Servidor server = new Servidor();

			// Exportação do objeto remoto.
			TrocaMensagens stub = (TrocaMensagens) UnicastRemoteObject.exportObject(server, 0);

			// Registro do objeto remoto com RMI Registry.
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("TrocaMensagens", stub);

			System.err.println("Servidor está pronto...");

		} catch (Exception e) {
			System.err.println("Exceção no Servidor:" + e.toString());
			e.printStackTrace();
		}
	}

}
