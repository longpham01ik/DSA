/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long34
 */
public class MyStack {
    Message head;
    int size;
    int data;
    
   public MyStack() {
        this.head = null;
        this.size = 0;       
    }
    public boolean isEmpty() {// check stach có Null hay ko
        return (head == null);
    }
    public void push(Message node){ // để đẩy một message vào Stack
        node.next = head;
        head = node;
        size++;
    }
      public Message pop() //lay tin nhan` of stack end xóa cmn luon khỏi stack
      {
          if (isEmpty() ){
        return null;
        }
          else{
              Message message = head;
              head = head.next;
              size--;
              return message;           
          }
      }
      public void print(){
       Message currentMessage =head;
       while(currentMessage != null){
          currentMessage.printData();
           currentMessage = currentMessage.next;
       }  
    }
}