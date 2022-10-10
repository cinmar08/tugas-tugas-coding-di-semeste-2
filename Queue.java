/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.LinkedList;
import java.util.Queue; 
/**
 *
 * @author LENOVO
 */
public class Queue {
    public static void main (String[] args){
        Queue<String> WaitingQueue = new LinkedList<>();
        
        waitingQueue.add ("Ricky");
        waitingQueue.add ("Chris");
        waitingQueue.add ("John");
        waitingQueue.add ("Mark");
        waitingQueue.add ("Steven");
        
        System.out.println("WaitingQueue : " + waitingQueue);
        
        String name = waitingQueue.remove();
        System.out.println("removed from WaitingQueue : " +name +" | New WaitingQueue : " + waitingQueue);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
