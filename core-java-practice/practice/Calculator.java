import java.util.*;

public class Calculator{
    int a;
    int b;
    int c;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public void sub(int a, int b){
        int c = a-b;
        System.out.println(c);
    }

    public void mul(int a, int b){
        int c = a*b;
        System.out.println(c);
    }

    public void div(int a, int b){
        int c = a/b;
        System.out.println(c);
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Enter your choice for menu");
        System.out.println("1. Add \n 2. Sub \n 3. mul \n 4. div");
        System.out.print("Enter: ");
        int choice = sc.nextInt();

        Calculator c = new Calculator(a,b);

        switch (choice){
            case 1 : {
                c.add(a,b);
                break;
            }
            case 2 : {
                c.sub(a,b);
                break;
            }
            case 3 : {
                c.mul(a,b);
                break;
            }
            case 4 : {
                c.div(a,b);
                break;
            }
            default : {
                System.out.println("Please enter a correct choice";
            }
        }
    }
}