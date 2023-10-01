public class Reverse_Words_557 {
    public static  String reverseWords(String s) {
        StringBuilder q = new StringBuilder(s.length());
        int n=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                for(int k=i-1;k>=n;k--){
                    q.append(s.charAt(k));
                }
                q.append(" ");
                n=i+1;
            }
            if(s.length()-i==1){
                for(int k=i;k>=n;k--){
                    q.append(s.charAt(k));
                }
            }
        }
        return q.toString();
    }
    public static void main (String[]args){
        String s = "Hello this is the first string";
        System.out.println(reverseWords(s));
    }
}
