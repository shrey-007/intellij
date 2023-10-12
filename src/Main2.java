import java.util.Scanner;
public class Main2 {
    static int func(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){sum=sum+(s.charAt(i)-'0');}
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next();
        System.out.println("sum is "+func(s));
    }
}
