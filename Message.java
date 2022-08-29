/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long34
 */
public class Message {
    String messageContent;
    Message next;
    
    public Message(String messageContent) {
        this.messageContent = messageContent;
        this.next = null;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setContent(String messageContent) {
        this.messageContent = messageContent;
    }
    
    public void printData(){
        System.out.println(this.getMessageContent());
    }
}
