import java.util.Scanner;

class TwoDArraySum {
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimensions of the first array: ");
        int m = in.nextInt();
        int n = in.nextInt();

        TwoDArraySum a = new TwoDArraySum(m, n);
        a.readArray();

        System.out.println("Enter the dimensions of the second array: ");
      int x = in.nextInt();
        int y = in.nextInt();

        TwoDArraySum b = new TwoDArraySum(x, y);
        b.readArray();

        TwoDArraySum sum = a.add(b);
        if (sum != null) {
            System.out.println("Sum of arrays: ");
            sum.displayArray();
        }
    }


    private int[][] arr;

    TwoDArraySum(int m, int y) {
        arr = new int[m][y];
    }

    void readArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
    }

    TwoDArraySum add(TwoDArraySum sum) {
        if (arr.length != sum.arr.length || arr[0].length != sum.arr[0].length) {
            System.out.println("Error: Arrays cannot be added due to different dimensions.");
            return null;
        }

        TwoDArraySum result = new TwoDArraySum(arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.arr[i][j] = arr[i][j] + sum.arr[i][j];
            }
        }

        return result;
    }

    void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

   
}