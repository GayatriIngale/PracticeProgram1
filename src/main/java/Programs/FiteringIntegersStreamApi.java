package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FiteringIntegersStreamApi {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("gayu");
        list.add("3g4");
        list.add(3);
        list.add('c');
        list.add(8);
        List<Object> check = list.stream().filter(FiteringIntegersStreamApi::isNumberOnly).collect(Collectors.toList());
        System.out.println(check);
    }

    private static boolean isNumberOnly(Object o) {
        String s = o.toString();
        boolean b = false;
       for (int i=0;i<s.length();i++){
           if (s.charAt(i)>'0' && s.charAt(i)<'9'){
               b=true;

           }
           else {
               b=false;
               break;
           }

       }
        return  b;
    }


}
