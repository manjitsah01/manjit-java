import java.util.Scanner;

public class invertedhfpynum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter rows number n : " );
        int n = sc.nextInt();
        
    
    for( int i = n ; i>=1; i--){  // (int i  = 1 ; i<=n; i++)
        for (int j = 1 ; j<=i; j++){ // (int j =1 ; j <=n-i+1; j++)
            System.out.print(j +" ");
    }
System.out.println();
    }
    }

}
    