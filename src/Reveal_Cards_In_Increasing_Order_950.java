import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


class Solution {
        static Node head = null;
    static Node last = null;

    static void createPile(int n) {
        head = new Node(n);
        last = head;
    }

    static void addFirst(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    static void shift() {
        last.next = head;
        if (head != null) {
            head.prev = last;
        }
        head = last;
        last = last.prev;
        if (last != null) {
            last.next = null;
        }
        if (head != null) {
            head.prev = null;
        }
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        int n =deck.length;
        createPile(n);
        while (n > 2) {
            n--;
            addFirst(n);
            shift();
        }
        n--;
        addFirst(n);
        Node temp = head;
        int[] res = new int [deck.length];
        Arrays.sort(deck);
        int i = 0;
        if(deck.length>1){
            while (temp != null) {
                res[i]=deck[temp.data-1];
                i++;
                temp = temp.next;
            }
        }else{
            res[0]=deck[0];
        }
    return res;
    }
}
