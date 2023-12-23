*ResizableArray - A Dynamic Array Implementation *
public class MyArr {
    private int length;  // Length of the array
    private int[] data;   // Array to store data

    // Constructor initializes the array with a default size (you can adjust it based on your requirements)
    public MyArr() {
        this.length = 0;
        this.data = new int[10]; 
    }

    // Method to get the element at a specific index
    public int get(int index) {
        return this.data[index];
    }

    // Method to add an element to the end of the array
    public void push(int item) {
        ensureCapacity();  // Ensure that the array has enough space
        this.data[this.length] = item;
        this.length++;
    }

    // Method to remove and return the last element from the array
    public int pop() {
        if (this.length == 0) {
            throw new IllegalStateException("Array is empty");
        }

        int lastItem = this.data[this.length - 1];
        this.length--;
        return lastItem;
    }

    // Method to delete an element at a specific index
    public void delete(int index) {
        if (index < 0 || index >= this.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        shiftItems(index);  // Shift the remaining elements to fill the gap
    }

    // Helper method to shift elements to the left starting from a specific index
    private void shiftItems(int index) {
        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.length--;
    }

    // Helper method to ensure that the array has enough capacity
    private void ensureCapacity() {
        if (this.length == this.data.length) {
            int[] newData = new int[this.data.length * 2]; // Resize the array (adjust the multiplier as needed)
            System.arraycopy(this.data, 0, newData, 0, this.length);
            this.data = newData;
        }
    }

    // Main method to test the array operations
    public static void main(String[] args) {
        MyArr newArr = new MyArr();

        newArr.push(1);
        newArr.push(12);
        newArr.pop();

        // Print the array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr.get(i) + " ");
        }
    }
}
