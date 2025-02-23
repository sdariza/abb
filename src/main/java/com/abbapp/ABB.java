package com.abbapp;


public class ABB {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void addNewNode(int theData) {
        Node newNode = new Node(theData);
        if (root == null) {
            root = newNode;
        } else
            addABBNode(root, newNode);
    }

    public void addABBNode(Node root, Node newNode) {
        if (newNode.data > root.data) {
            if (root.right == null) {
                root.right = newNode;
            } else
                addABBNode(root.right, newNode);
        } else if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
            } else
                addABBNode(root.left, newNode);
        } else
            System.out.printf("The new node %d alreay exists in the tree!", newNode.data);

    }

    public boolean searchABB(Node root, int x) {
        if (root == null) {
            return false;
        } else if (root.data == x) {
            return true;
        } else if (root.data > x) {
            return searchABB(root.left, x);
        } else
            return searchABB(root.right, x);
    }

    public void printLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " |");
        } else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

}
