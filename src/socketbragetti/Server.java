/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketbragetti;

/**
 *
 * @author Carlo
 */
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
	public static void main(String[] args) throws IOException 
	{
		ServerSocket serverSocket=null;
                Socket connection;
                Countdown c=new Countdown();
        
        try
                {
                    serverSocket = new ServerSocket(2000);
                    System.out.println("In attesa di connessioni!");
                    serverSocket.setSoTimeout(5000);
                    c.start();
                    Socket socket = serverSocket.accept();
                    System.out.println("Connessione stabilita!");
                    System.out.println("Socket server:"+socket.getLocalSocketAddress());
                    System.out.println("Socket client:"+socket.getRemoteSocketAddress());
                }
        catch (IOException ex) {
            System.err.println("Errore nella chiusura della connessione!");
            serverSocket.close();
        }
        
        try {
                if (serverSocket!=null) serverSocket.close();
            } catch (IOException ex) {
                System.err.println("Errore nella chiusura della connessione!");
            }
            System.out.println("Connessione chiusa!");
            c.interrupt();
            }
	
}
