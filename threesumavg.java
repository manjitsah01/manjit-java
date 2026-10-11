
    import java.util.Scanner;

public class threesumavg {
     public static int calculateavg(int a , int b ,int  c ){
        return (a+b+c)/3 ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();


System.out.println( "average of 3  number is : " + calculateavg(a , b ,c));
    }
}



