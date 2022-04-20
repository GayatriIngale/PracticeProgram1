package Programs;

public class StringContainsDigit {
    public static void main(String[] args) {
        String s = "Gayatri89";
        int count =0;
        boolean check = true;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>'0' && s.charAt(i)<'9'){
               check=true;
                break;

            }
            else
               check=false;
        }
        System.out.println(check);
        if(check)
            System.out.println("String contains Numbers as well");
        else
            System.out.println("string contains Characters only");

    }
}



//            if(s.charAt(i)>'a' || s.charAt(i)<'z' || s.charAt(i)>'A' || s.charAt(i)<'Z' ){
//                count++;
//                System.out.println("String contains character as well ");
//                break;
//            }
//            else
//                System.out.println("String contains digits only");