import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
              System.out.println("enter 1st number ");
              double num1 =  sc.nextDouble();
              System.out.println("enter operator ( +, - , * ,/)");
              char op = sc.next().charAt(0);
              System.out.println("enter 2nd number ");
              double num2 = sc.nextDouble();
              
switch (op) {
    case '+' :System.out.println(num1 + num2 );        
    
        break;
case '-': System.out.println(num1 - num2); 
 break;
 case '*' : System.out.println(num1 * num2);
 break;
 case '/' :System.out.println(num1 / num2);
 break;

  default: System.out.println("invalid");
        break;
}
    }
}
