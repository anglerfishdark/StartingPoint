import java.util.Scanner;

public class TwoDopr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input the elements of the 2D array
        int[][] array = new int[rows][columns];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Choose an operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = scanner.nextInt();

        // Perform the chosen operation
        int[][] resultArray = new int[rows][columns];
        switch (choice) {
            case 1:
                // Addition
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        resultArray[i][j] = array[i][j] + array[i][j];
                    }
                }
                break;
            case 2:
                // Subtraction
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        resultArray[i][j] = array[i][j] - array[i][j];
                    }
                }
                break;
            case 3:
                // Multiplication
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        resultArray[i][j] = array[i][j] * array[i][j];
                    }
                }
                break;
            case 4:
                // Division
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (array[i][j] != 0) {
                            resultArray[i][j] = array[i][j] / array[i][j];
                        } else {
                            System.out.println("Cannot divide by zero. Setting result to 0.");
                            resultArray[i][j] = 0;
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Display the result
        System.out.println("Resultant array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}