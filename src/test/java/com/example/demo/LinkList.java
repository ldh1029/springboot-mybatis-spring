package com.example.demo;

import org.springframework.util.ObjectUtils;

/**
 * Created by ldh on 2018/6/19.
 */
public class LinkList {
    private Node head;
    public void insert(int data){
        while (head.next != null){
            head = head.next;
        }
        Node node = new Node(6);
        head.next = node;
    }

}
