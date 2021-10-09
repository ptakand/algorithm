package InsertionSort;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        // creating an array
        ArrayIns arr = new ArrayIns(maxSize);

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

        arr.insertionSort();
        arr.display();
    }
}

class ArrayIns {
    private long[] a;
    // the number of elements in the array
    private int nElems;

    // constructor
    public ArrayIns(int max) {
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

    // implementation Insert sort
    public void insertionSort() {
        int in, out;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in>0 && a[in-1] >= temp){
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;

        }
    }

}






