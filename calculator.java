import java.util.*;
class calculator
{
    public static void main(String args[])
    {
boolean go=true;
 Scanner sc = new Scanner(System.in);
        while(go){
        double num1,num2;
       
        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
     char ch;
        System.out.print("Enter the operation you want to perform: ");
        System.out.print("+, -, *, /, ^, %, s, c :");
        ch = sc.next().charAt(0);
        if(ch== 's'|| ch=='c'){
            num2= 0;
            
        }
        else{

        
        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();
        }

        int n=0;
        if(ch=='+')
        {
            n=1;
        }
        else if(ch=='-')
        {
            n=2;
        }
        else if(ch=='*')
        {
            n=3;
        }
        else if(ch=='/')
        {
            n=4;
        }
        else if(ch=='^')
        {
            n=5;
        }
        else if(ch=='%')
        {
            n=6;
        }
        else if(ch=='s'|| ch=='S')
        {
            n=7;
        }
        else if(ch=='c'|| ch=='C')
        {
            n=8;
        }




switch(n)
{
    case 1 -> System.out.println("Addition"+"="+(num1+num2));
    case 2 -> System.out.println("subtraction"+"="+(num1-num2));
    case 3 -> System.out.println("multiplicition"+"="+(num1*num2));
    case 4 -> System.out.println("Division = " + ((double)num1 / num2));
        case 5 -> System.out.println("Exponentiation = " + Math.pow(num1, num2));
        case 6 -> {
            System.out.println("Enter 1 for num1%num2 or 2 for num2%num1");
            
            if(num2==0) {
                System.out.println("Modulus is not allowed");
            } else {
                System.out.println("Modulus = " + (num1 % num2));
            }
        }
        case 7 -> {
            if(num1<0) {
                System.out.println("Square root is not allowed for negative numbers");
            } else {
                System.out.println("Square root of num = " + Math.sqrt(num1));
            }
        }
        case 8 -> System.out.println("Cube root of num = " + Math.cbrt(num1));
    default -> System.out.println("Invalid operation selected. Please choose a valid option.");
    }

      System.out.println("do YOU want to continue?, ");  
      char ci=sc.next().charAt(0);
      if(ci=='y'|| ci=='Y') {
        go=true;

      }
      else {
        go=false;
        System.out.println("Thank you for using the calculator!");}

    }
    sc.close();

        }
    }


