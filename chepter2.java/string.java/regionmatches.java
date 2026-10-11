public class regionmatches {
    public static void main(String[] args) {
        String  myStr1 = "hellow world ";
        String myStr2 = "new world ";
        System.out.println(myStr1.regionMatches(7 ,myStr2, 4,5 ));
        System.out.println(myStr1.regionMatches(0 , myStr2, 0 , 5  ));
    }
}
