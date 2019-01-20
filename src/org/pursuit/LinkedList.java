package org.pursuit;

public class LinkedList {
    LinkedListNode head;

    public LinkedList(LinkedListNode head) {
        this.head = head;
    }
    public void append ( int element){
        LinkedListNode temp = new LinkedListNode(element);
        LinkedListNode current = head;
        if(head ==null){
            head = temp;
        }
        //loop thru all links in list
        while (current.next != null){

        current = current.next;
        }
        current.next = temp;



    }


    public void prepend(int element){
        LinkedListNode temp = new LinkedListNode(element);
        temp.next = head;
        head = temp;
    }

    public void delete(int value){
        LinkedListNode temp = head;
        LinkedListNode prev = temp;

        while(temp != null && temp.data != value){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
    }



    public void print(){
        LinkedListNode current = head;
        while (current != null){
            System.out.print(current.data + " -->" );
            current = current.next;
        }
        System.out.println("NUll\n");
    }
}

