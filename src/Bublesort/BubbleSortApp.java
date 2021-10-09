package Bublesort;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        //creating an array
        ArrayBub arr = new ArrayBub(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        arr.bubleSort();
        arr.display();
    }
}

class ArrayBub {
    private long[] a;
    // the number of elements in the array
    private int nElems;

    // constructor
    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    // inserting an element into an array
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    // displaying the contents of the array
    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("");
    }

    // implementation Bubble sort
    public void bubleSort() {

        int out, in;
        for (out = nElems-1; out>1; out--)
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    long temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
    }}






