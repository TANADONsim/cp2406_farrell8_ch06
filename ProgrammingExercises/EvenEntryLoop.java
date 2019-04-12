import java.util.Scanner;
public class EvenEntryLoop
{

    Scanner in = new Scanner(System.in);

    int num;

    public static class EvenEntryLoopTest
    {

        public static void main(String [] args){

            EvenEntryLoop oddEvenTest =  new EvenEntryLoop();

            oddEvenTest.evenOdd();

        }

    }

    public void evenOdd()
    {

        System.out.println("Enter an integer [999 to exit]: ");

        num=Integer.parseInt(in.nextLine());

        do{

            if(num % 2 == 0)

                System.out.println("Good Job!");

            else

                System.out.println("Error: You entered an odd number!!!");

            System.out.println("Enter an integer [999 to exit]: ");

            num=Integer.parseInt(in.nextLine());

        }while(num!=999);

    }

}

