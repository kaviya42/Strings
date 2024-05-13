public class Occurance {
    public static void main(String[] args) {
        String s = "rats are rambling";
 
        String s1 = "";
 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'r') {
                s1 = s1 + '#';
            } else {
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}