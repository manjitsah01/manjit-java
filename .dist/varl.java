public class varl{
    int data =50;
static int m = 100;
void mymethod (){

 int n =98;
 System.out.println(n);
}
    public static void main(String[] args) {
      
        varl obj = new varl();
        obj.mymethod();
        System.out.println(obj.data);
        System.out.println(m);
    }
}