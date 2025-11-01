import java.util.Scanner;
import java.util.Random;
// Java Lab 3 Task-3
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Nums: ");
        int a=input.nextInt() , b=input.nextInt(), c=input.nextInt();
        double d=b*b-4*a*c;
        double x1=0;
        double x2=0;

        switch((int) d){
            case 0:
                if(-b / (2*a) == 0)
            {
                System.out.println("The root X1 and X2 are the same");

            }


                break;

            case 1:
                x1= -b +Math.sqrt(d) / (2*a);
                x2= -b -Math.sqrt(d) / (2*a);
                System.out.println("The root X1 is:" + x1 + "The root X2 is:" +x2);
                break;

            default:
                System.out.println("There no proper root");
                break;

        }


    }
}

// Java Lab 3 Task-5

public class Main{
    public static void main(String[] args){
        Random random=new Random();
        int number=random.nextInt(100)+1;
        int count =1;
        int largest=number;
        int smallest=number;

        while(count<10){
            count++;
            number=random.nextInt(100)+1;

            if(number>largest){
                largest=number;
            }
            else{
                smallest=number;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: "+smallest);

    }
}

// Java Lab 3 Task-4

public class Main{
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("The sum of even is :" + sum);
    }
}