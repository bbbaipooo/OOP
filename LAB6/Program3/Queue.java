package Program3;

public class Queue {
    private int[] elements;
    private int size = 0;

    // Constructor
    Queue() {
        this.elements = new int[8];
    }

    // Method
    public void enqueue(int v) {
        if (this.size == this.elements.length) {
            int[] temp = new int[elements.length * 2]; // index x2
            System.arraycopy(elements, 0, temp, 0, elements.length);
            this.elements = temp;
        }
        this.elements[size] = v;
        size++;
    }

    public int dequeue() {
        int fEle = this.elements[0];
        for (int i = 0; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return fEle;
    }

    public boolean empty() {
        return (this.size == 0);
    }

    public int getSize() {
        return this.size;
    }
}
