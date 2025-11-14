

public class FlexibleArray<E> {
    /**
     * WE USE THIS CONSTRUCTOR TO CREATE AN ARRAY WHEN WE KNOW
     * HOW MANY ELEMENTS TO STORE IN THE ARRAY
     *
     * @param size
     */
//An array with fixed size
    private E[] elements;
    private static final int INITIAL_CAPACITY = 5;
//the variable to store how many elements we have added to the array
    public FlexibleArray(int size) {
        elements = (E[]) new Object[size];
    }

    /**Use this constructor to create an array with a default capacity
     */

    public FlexibleArray() {
        elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * add an element to the array at its last position
     * @param element
     */
/*
    public void add(E element, ) {
        //paso 0: check if we have reached to the last position,
        //if true, we have to expand the capacity of the array
        if (size == elements.length) {
            // Si el array está lleno, lo expandimos
            expandCapacity();
        }
        //paso 1: add the element to the last position of the array

*/
    }

    /**
     * remove the element at position "i"
     *
     * @param i
     */

    public void remove(int i) {

    }

void main() {
}

   /* public E size() {
        return 0;
    }

    */


