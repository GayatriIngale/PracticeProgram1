package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNoUsingStreamApi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> prime = list.stream().filter(PrimeNoUsingStreamApi::isPrime).collect(Collectors.toList());
        System.out.println(prime);
    }

    public static boolean isPrime(int n){
        int temp = n;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
}
