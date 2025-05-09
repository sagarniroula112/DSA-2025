package com.DSA.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printItems() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;

        Node toRemove = tail;

        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            toRemove.prev = null;
            tail.next = null;
        }
        length--;
        return toRemove;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node temp = head;
        
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;

        return temp;

        // if(length == 0) return null;
        
        // Node temp = head;
        // head = head.next;
        // head.prev = null;
        // temp.next = null;
        // length--;
        
        // if(length == 0) {
        //     head = null;
        //     tail = null;
        // }
        
        // return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >=length) {
            return null;
        }

        Node temp = head;
        if(index < length/2){
            for(int i=0;i<index;i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i=length-1;i>index;i--) {
                temp = temp.prev;
            }
        }
    
        return temp;
    }

    public boolean set(int index, int value) {
        if(index < 0 || index >= length) {
            return false;
        }

        Node temp = head;
        if(index < length/2) {
            for(int i=0;i<index;i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i=length-1;i>index;i++) {
                temp = temp.prev;
            }
        }
        
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index>length) {
            return false;
        }

        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);

        Node prev = null;
        Node temp = head;

        for(int i=0;i<index;i++) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = newNode;
        temp.prev = newNode;
        newNode.next = temp;
        newNode.prev = prev;
        length++;

        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) {
            return null;
        }

        Node temp = null;

        if(index == 0) {
            temp = removeFirst();
        } else if(index == length-1) {
            temp = removeLast();
        } else {
            Node prev = null;
            temp = head;

            for(int i=0;i<index;i++) {
                prev = temp;
                temp = temp.next;
            }

            prev.next = temp.next;
            temp.next.prev = prev;
            temp.next = null;
        }
        return temp;
        
    }
}