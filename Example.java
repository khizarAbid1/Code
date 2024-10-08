import java.util.Scanner;

public class Example {


        //Returning Statement
        static Scanner input=new Scanner(System.in);
        public static double large(int x,int y)
        {
           int max;
            if(x>=y)
            {
                max=x;
            }
            else
            {
                max=y;
            }
            return max;
        }

        public static void main(String[] args)
        {
            int number;
            System.out.println("Enter the First Number");
            number= input.nextInt();
            int number1;
            System.out.println("Enter the Second number");
            number1= input.nextInt();
            System.out.println("MAX NUMBER IS : "+large(number,number1));

        }


    }

