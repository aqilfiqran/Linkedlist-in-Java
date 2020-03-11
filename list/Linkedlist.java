package list;

public class Linkedlist {
    private Node head;
    private int size;

    public Linkedlist() {
        this.head = null;
        this.size = 0;
    }

    public void setHead(Node head) {
        this.head = head;
        this.incSize();
    }

    public void incSize() {
        this.size++;
    }

    public void decSize() {
        this.size--;
    }

    public int Size() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }

    public void add(Data data) {
        this.setHead(new Node(data, this.getHead()));
    }

    public void display() {
        Node current = this.getHead();

        while (current != null) {
            System.out.println(current.getData().getNama());
            if (current.getNext() == null)
                break;
            current = current.getNext();
        }
    }

    public boolean delete(String nama) {
        Node current = this.getHead();
        if (current.getData().getNama().equals(nama)) {
            this.setHead(current.getNext());
        } else if (current.getNext() != null) {
            while (!(current.getNext().getData().getNama().equals(nama))) {
                current = current.getNext();
                if (current.getNext() == null)
                    return false;
            }
            if (current.getNext().getNext() != null)
                current.setNext(current.getNext().getNext());
            else
                current.setNull();
        } else
            return false;
        this.decSize();
        return true;
    }

}