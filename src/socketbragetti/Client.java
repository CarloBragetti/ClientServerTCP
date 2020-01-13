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
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
	public static void main(String[] args)
        {
            Socket socket=null;
            String serverAddress = "localhost";
            int port = 2000;
            try {
                socket = new Socket("localhost", port);
                System.out.println("Connessione Aperta");
            } catch (ConnectException e) {
                System.err.println("Server non disponibile!");
            } catch(UnknownHostException e1){
                System.err.println("Errore DNS!");
             }catch (IOException e2) {
                System.err.println(e2);
                e2.printStackTrace();
            } 
            
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
}
