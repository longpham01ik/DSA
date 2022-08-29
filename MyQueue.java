/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Long34
 */
public class MyQueue {
    Message head;
    Message tail;
    int size;
    public boolean isEmpty(){ //check queue co null hay ko
        return(size ==0);   
    }
    public void enqueue(Message message){ //thêm tin nhan' vao` queue
        if(isEmpty()){
            head = tail = message;
            size++;
        }
        else{
            tail.next = message;
            tail= message ;
            size++;
        }
    }
    public Message dequeue(){ //xoa' mess trc của queue
    if(isEmpty()){
            System.out.println("Queue is Empty");
            return null;
        }
        else {
            Message n = head;
            head = head.next;
            size--;
            return n;
        }
    }
}
