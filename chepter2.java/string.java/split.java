
public class split {
    public static void main(String[] args) {
        String myStr = "split a string by spaces and also punctuation";
        String regex = "[,\\ .\\s]";
        String[] myArray = myStr.split(regex);
        for(String s : myArray){
            System.out.println(s);
        }
    }
    
}
