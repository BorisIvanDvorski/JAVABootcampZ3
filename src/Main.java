import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intInput;
        int input=0, sum=0;

        do{
            intInput = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            try{
                input=intInput.nextInt();
            }
            catch (Exception e) {
                System.out.println("Invalid input, please enter an integer.");
                continue;
            }
            switch(input%7) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 0:
                    System.out.println("Sunday");
                    break;
            }
            if(input==0 || input%2==1){
                continue;
            }
            if(input%2==0 && input>0){
                sum=sum+input;
            }
        } while(input>=0);
        System.out.println("The sum of even numbers entered is: "+sum);


    }
}