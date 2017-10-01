public class HeapSort implements Sorting{
    private int[] array;
    private int n, left, right, largest;

    public void sort(int[] _array) {
        array = _array;
        buildHeap(array);
        for (int i = n; i > 0; i--) {
            swap(0, i);
            n = n - 1;
            maxHeap(array, 0);
        }
    }

    private void buildHeap(int[] a) {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxHeap(a, i);
        }
    }

    private void maxHeap(int[] a, int i) {
        left = 2 * i;
        right = 2 * i + 1;

        if (left <= n && array[left] > array[i])
            largest = left;
        else
            largest = i;

        if (right <= n && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            maxHeap(array, largest);
        }
    }

    private void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }


}
