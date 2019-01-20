package org.pursuit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //build a node

        LinkedListNode linked = new LinkedListNode( 5);
        System.out.println(linked);
        System.out.println(linked.data);
        linked.next = new LinkedListNode(10);
        System.out.println(linked.next);
        System.out.println(linked.next.data);
        //gives pointer xception
//        System.out.println(linked.next.next.data);
        LinkedListNode head = new LinkedListNode( 8);

        LinkedList mylist = new LinkedList(head);
        System.out.println(mylist.head);
        mylist.append(7);
        System.out.println(mylist.head.next);
        System.out.println(mylist.head.next.data);
        mylist.print();





    }


    //takes in array and removes

    private static int[] removeE (int[] arr, int index) {
        int[] arr3 = new int[arr.length - 1];

        int i = 0;
        int j = 0;

        while (i < index) {
            arr3[i] = arr[i];
            i++;
            j++;
        }
        while (i >= index && j <= arr3.length) {
            if (i == index) {
                i++;
            }
            arr3[j] = arr[i];
            i++;
            j++;


        }

      return arr3;
    }
}


