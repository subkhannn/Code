import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Java Lab 5 Task-2
public class Main{
    public static void main(String[] args){
        int[] numbers = new int[10];
        Random rand = new Random();
        for(int i = 0;i<numbers.length;i++){
            numbers[i] = rand.nextInt(100);
            int j =numbers[i];
            System.out.println(j + "");
        }

        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }

            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

// Java Lab Task-3

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int diagonal=0;

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==j){
                    matrix[i][j]=i;
                    diagonal+=i;
                }
                System.out.print(matrix[i][j] + "");
            }
        }
//        for(int i=0;i<10;i++){
//            for(int j=0;j<10;j++){}
//        }
        System.out.println("\nSum:" + diagonal);
    }
}

// Java Lab 5 Task - 5
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String palindrome="";

        for (int i =text.length()-1; i>=0; i--) {
            palindrome+=text.charAt(i);

        }
        System.out.println(palindrome);

    }
}