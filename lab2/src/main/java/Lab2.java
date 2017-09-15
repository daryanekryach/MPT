import java.util.Scanner;
import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input array size: ");

        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        ArrayOperations operations = new ArrayOperations(array);

        System.out.println("Number of even elements: " + operations.getEvenNumbers());
        System.out.println("Array delta: " + operations.getDelta());
        System.out.println("Array mean: " + operations.getMean());
        System.out.println("Max and min sum: " + operations.getMaxMinSum());
        System.out.println("Module max element: " + operations.getModuleMax());

//        System.out.println("Sum of elements multiplied by 3:" + operations.getEvenNumbers());

//         for(int i=0; i<array.length; i++){
//             System.out.print(array[i] + " ");
//         }

        System.out.println("Set array dimension: ");
        size = input.nextInt();
        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(15);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
}
