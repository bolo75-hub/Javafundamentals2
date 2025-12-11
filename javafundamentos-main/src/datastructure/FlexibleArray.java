package datastructure;
/*
 * This is a class that represent an extensible array
 * An aaray has a fixed capacity, when ranching the end
 * of the array, we have to expand it automaticaly*/
public class FlexibleArray <E> {
    private E[] elements;
    private static final int initial_capacity = 5;
    //the variable to sotore how many elemets we have added to the array
    private int size = 0;

    private static int expansion_factor;

    public FlexibleArray(int size) {
        elements = (E[]) new Object[size];
    }

    public FlexibleArray() {
        elements = (E[]) new Object[initial_capacity];
    }
    /*
     * add an element to the array at its last position
     * @param e
     * */

    public void add(E i){
        //paso 0: check if we have reached to the last position
        // if true, we have to expand the capacity of the array
        if(size == elements.length) {
            //the array is full, so we have to extend its capacity
            //first we create a new array with a mayor capacity
            E[] newArr = (E[]) new Object[elements.length + expansion_factor];
            //copy the elements from the old array to the new one
           // newArr[0] = elements[0];
          //  newArr[1] = elements[1];
            for (int i = 0; i < elements.length; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;
        }

        // paso 1: add the element to the last free position of the array
        elements[size] = element;
        size++;


        for (int j = 0; j < elements.length; j++) {
            if (elements[i] == null) {
                elements[j] = i;
                size--;
            }
        }

    }
    /*
     * remove an element to the array at its last position
     * @param i
     * */
    public void remove ( int i) {
       //step 1: eliminate the element at position passed by the parameter
        elements[i] = null;
        //elements[i] = elements[i+1];
        //elements[i + 1] = elements[i+2];
        //elements[i + 2] = elements[i+3];
        //elements[i + 3] = elements[i+4];
        //...
        for (int j = 0; j < 5; j++) {

            E e = elements[j];
        }
        size--;
    }
    public int size(){


        return elements.length;
    }
}


