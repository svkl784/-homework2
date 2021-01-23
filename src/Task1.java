import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        int value = 1;
        int p1 = 0;
        int p2 = size;
        for( int k = 0; k < size / 2 + 1; p1++, p2--, value++, k++) {
            for(int i = p1; i < p2; i++){
                for(int j = p1; j < p2; j++) {
                    array[i][j] = value;
                }
            }
        }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
                System.out.println();
        }
    }
}
