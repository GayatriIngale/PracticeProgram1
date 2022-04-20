package Programs;

public class ReversString {
    public static void main(String[] args) {
        System.out.println(reverseWord("I Am Gayatri Ingale"));
    }

    public static  String reverseWord(String str){
        String word[] = str.split("\\s");

        String stringWord = "";
        for(String s : word){
//            StringBuilder sb = new StringBuilder(s);
//            sb.reverse();

            String s1 ="";
            for(int i=s.length()-1;i>=0;i--){
                char c = s.charAt(i);
                s1 += Character.toString(c);
            }
            stringWord += s1+" ";

        }
        return  stringWord;
    }


}

