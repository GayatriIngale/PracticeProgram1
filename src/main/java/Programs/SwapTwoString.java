package Programs;

public class SwapTwoString {
    public static void main(String[] args) {
        String a= "Gayatri";
        String b = "Snehal";
        a = a.concat(b);
        System.out.println(a);
        b = a.substring(0,a.length()-b.length());
        System.out.println(b);
        a = a.substring(b.length());
        System.out.println(a);

    }
}
