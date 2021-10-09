package SelectionSort;

public class selectionSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySelect arr = new ArraySelect(maxSize);   // sozdanieje massiva

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



        arr.selectSort();
        arr.display();
    }
}

class ArraySelect {
    private long[] a;
    // the number of elements in the array
    private int nElems;

    //constructor
    public ArraySelect(int max) {
        a = new long[max];
        nElems = 0;
    }

    //inserting an element into an array
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    //displaying the contents of the array
    public void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("");
    }

    // implementation Selection sort
    public void selectSort() {
        int in, out;
        for (out = 1; out < nElems-1; out++) {
           long temp = a[out];
           in = out;
            for (in = out+1; in < nElems; in++) {
                if (a[in]<a[min]){
                    min = in;
                }
                int temp = (int) a[out];
                a[out] = a[min];
                a[min] = temp;

            }

        }
        }



}






