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
public class Countdown  extends Thread{
    @Override
    public void run(){
        for(int i=5000; i>0; i-=1000){
            boolean stop = Thread.currentThread().isInterrupted();
            try {
                sleep(1000);
                System.out.println("CountDown: "+ i/1000 + " secondi");
                if (stop) {
                    break;
                }
            }
            catch (InterruptedException ex) {
                System.out.println("ERRORE");
            }
        }
    }
}
