package pl.narodzinyprograsmity;

public class BinarySearch {

    /**
     * Binary Search
     * O(log n)
     *
     * If we use sorted list we can fast search some element.
     * Pick middle element and compare to our number.
     * If bigger then our element then low is middle + 1 element
     * if greater then our element then high is middle -1 element.
     *
     * Every operation cut half of elements.
     * */

    public int search(int[] list, int number) {
        int low = 0;
        int high = list.length - 1;

        int mid;
        int guess;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = list[mid];

            if (guess == number) {
                return mid;
            } else if (guess < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
