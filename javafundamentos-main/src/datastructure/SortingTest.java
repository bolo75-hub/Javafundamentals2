package datastructure;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SortingTest {
    public static void main(String[] args) {
        int[] scores = {12, 24, 3232, 323, 3232, 32332, 32323, 323};
        String[] name = {"pablo", "diego", "jorge", "juan", "ana"};
        sort(scores);
        boolean isExisting = binarySearching(234, scores);
        System.out.println(IsExisting)
        isExisting = LinearSearching(234, scores);
        sort()
    }

    /**
     * In this algorithm, we search a specific element in an ordered array by
     * comparing the element with the ones in the array one by one
     * The time consumed in this algorithm is averagely proportional to
     * the size of the array.
     *
     * @param element
     * @param elements
     * @return
     */
    private static boolean LinearSearching(int element, int[] elements) {
        if (elements == null) {
            return false;
        }
        /**
         * Steps
         * 1 Create a loop to traverse the elements in the array
         * 2 In the body of the loop, we compare the element with
         * the elements of the array, if there is a match, we return
         * true
         */
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                return true;
            }

        }
        return false;
    }

    /**
     *
     * @param element
     * @param elements
     * @return
     */

    private static boolean binarySearching(int element, int[] elements) {

        //1 Calculate the index of the middle element
        int middleIndex = elements.length / 2;
        //2 If the middle element is equal to the element that we are looking for, return
        if (elements[middleIndex] == element) {
            return true;
        }
        //2 If the current element in the array is grater, we check the left half
        else if (elements[middleIndex] > element) {

        }
        //2 If the current element in the array is smaller than the element,
        // we check the right half
        else {//elements[middleIndex] < element

            return false;
        }


    }
}

