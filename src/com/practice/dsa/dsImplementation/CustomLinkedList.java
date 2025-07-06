package com.practice.dsa.dsImplementation;

public class CustomLinkedList<T> {

    // Node class
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;  // First element
    private Node<T> tail;  // Last element
    private int size = 0;

    // Add to end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add to beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Remove first element
    public T removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");

        T removed = head.data;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // list became empty
        }

        size--;
        return removed;
    }

    // Remove last element
}

