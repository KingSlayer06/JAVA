import java.util.Scanner;

public class Assignment {
    Scanner sc = new Scanner(System.in);
    
    //function to checkPalindrome
    public void checkPalindrome()  {
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        int i = 0;
        int j = num.length() - 1;

        boolean ispalindrome = true;
        while (i < j) {
            if (num.charAt(i) != num.charAt(j)) {
                ispalindrome = false;
                break;
            }
            i++; j--;
        }

        if (ispalindrome) 
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
            
        System.out.println();    
    }

    //function to printPattern

    public void printPattern() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for(int i = num; i > 0; i--) {
            for (int j = i; j> 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    //function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int prime = 1;
        for (int i=2; i<num; i++){
            if (num%i == 0) {
                prime = 0;
                break;
            }
        }

        if (prime == 1)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }

       

    // function to print Fibonacci Series
    public void printFibonacciSeries() {
        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print(first + "," + second + ",");
        
        for(int i=2; i<num; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + ",");
        }
        System.out.println();
    }

    //main method which contains switch and do while loop

    public static void main(String[] args) {
        Assignment obj = new Assignment();

        int choice;
        Scanner sc = new Scanner(System.in);

    do {

    System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

    System.out.print("Enter your choice: ");
    choice = sc.nextInt();

    switch (choice) {
        case 0: choice = 0;
                break;

        case 1: obj.checkPalindrome();
                break;

        case 2: obj.printPattern();
                break;

        case 3: obj.checkPrimeNumber();
                break;

        case 4: obj.printFibonacciSeries();
                break;

        default: System.out.println("Invalid choice. Enter a valid no.\n");
        }
    } while (choice != 0);

    System.out.println("Exited Successfully!!!");
    sc.close();
    }
}

