import java.util.Scanner;

public class input {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int evenCount = 0 ,oddCount =0;
 for(int i =0; i<n ;i++){
    int Weapons = sc.nextInt();
    if (Weapons % 2==0) { evenCount++ ;
        
    }else{
        oddCount++;
    }    
 }
 if(evenCount>oddCount){
    System.out.println("READY FOR BATTLE ");
 }else{
    System.out.println("NOT READY");
 }
 sc.close();
   }
}
