
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long34
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        Scanner sc = new Scanner(System.in);
        MyQueue mq = new MyQueue();
        MyStack ms = new MyStack();
        while ( 1 < 3 ) { 
            System.out.println("=^.^--------Main Menu--------^.^=");
            System.out.println("=-------------------------------=");
            System.out.println("|  Please enter the feature     |");
            System.out.println("| 1: Add new message            |");
            System.out.println("| 2: Message handling           |");
            System.out.println("| 3: Show current message       |");
            System.out.println("| 4: Exit                       |");
            System.out.println("=================================");
            int choice = sc.nextInt();    
                    switch (choice){
                    case 1:{
//                        System.out.println("Nhap tin nha'n ma` may` muon' gui?");
                    System.out.println("Please enter your information and press exit to finish");

                    String message="";
                    do {                        
                        message = sc.nextLine();
                            if(!("exit").equals(message)&& message.length()<250)
                            { 
                                mq.enqueue(new Message(message));
//                                System.out.println("tin nhan da dc gui");
                            }
                            else if(message.length()>=250){
                                System.out.println("Message failed to send, too long.");
                                System.out.println("Please re-enter your message");
                                
                            }else{
                                System.out.println("Exit");
                            }
                            
                        } while (!("exit").equals(message));
                    }        
                    break;
                    case 2:{
                    while(!mq.isEmpty()){
                        Message x = mq.dequeue();
                        ms.push(x);
                        System.out.println("Done message handling");
                        }
                    break;
                    }
                    case 3:{
                    System.out.println("The messages he received were: ");
                    while(!ms.isEmpty())
                    {
                        System.out.println(ms.pop().getMessageContent());
                    }
                    break;
                        }
                    case 4:{
                    System.exit(0);
                    break;
                    }
                    default:{
                        System.out.println("Wrong choice");
                    }
            }     
        }              
        } catch (Exception e) {
            System.out.println("Wrong choice, input selection is letter");
        }
    }
}
