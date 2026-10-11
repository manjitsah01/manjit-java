

public class replaceall {
    public static void main(String[] args) {
        String myStr = "I LOVE CATS . CATS ARE VERY EAST TO LOVE . CATS ARE VERY POPULAR ";
        String regex = "(?i)cat"; 
        System.out.println(myStr.replaceAll(regex, "dog"));
    }
}
