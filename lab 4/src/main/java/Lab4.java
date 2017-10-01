import java.util.Random;
import java.util.Arrays;

public class Lab4 {
    static int[] array;

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(50);
        }

        InsertionSort insertion = new InsertionSort();
        QuickSort quick = new QuickSort();
        BubbleSort bubble = new BubbleSort();
        ShellSort shell = new ShellSort();
        HeapSort heap = new HeapSort();
        CycleSort cycle = new CycleSort();

        insertion.sort(arrayCopy(array));

        quick.Sort(arrayCopy(array), 0, arrayCopy(array).length - 1);

        bubble.sort(arrayCopy(array));

        shell.sort(arrayCopy(array));

        heap.sort(arrayCopy(array));

        cycle.sort(arrayCopy(array));
    }

    public static int[] arrayCopy(int[] array){
        return Arrays.copyOf(array, array.length);
    }
}
