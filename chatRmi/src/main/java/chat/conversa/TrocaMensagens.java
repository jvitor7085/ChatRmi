package chat.conversa;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TrocaMensagens extends Remote{

	public String TrocaMsg(String mensagem) throws RemoteException;
}
