import java.util.Scanner;

public class mulby2function {
    public static int calculatemul(int a , int b) {
        int mul = a*b; // yaha kuch nhi
return mul ;   // or return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
int  mul = calculatemul(a, b);   // yaha kuch nhi 
System.out.println(  mul);        
    //    System.out.println("product of 2 number : "+calculatemul(a, b) );
 }
}
