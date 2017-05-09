package com.brettdavisgame.main;

/**
 * Created by Family on 4/23/2017.
 */
public class Node {

    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}
