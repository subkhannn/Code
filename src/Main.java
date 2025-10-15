import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter X: ");
            int x=input.nextInt();
            System.out.print("Enter Y: ");
            int y=input.nextInt();

            if(x>y)
            {
                System.out.println("X is greater than Y");
            }
            else if(y>x)
            {
                System.out.println("Y is greater than X");
            }

            else
            {
                System.out.println("Both of them are equal");
            }

        }
    }
}